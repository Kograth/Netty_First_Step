/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter;

import org.apache.camel.builder.RouteBuilder;

import java.lang.Exception;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cache.CacheConstants;
import org.apache.camel.impl.DefaultExchange;
//import org.apache.camel.impl.DefaultExchange;

import ru.cse.proxysorter.Processors.ProcessorRequest1C;
import ru.cse.proxysorter.Processors.ProcessorRequestSorter;

/**
 *
 * @author Oleynik
 */
public class ProxySorterBuilder extends RouteBuilder {

    public int ProductCode = 5555;
    public short CommandCode = 0x11;

    @Override
    public void configure() throws Exception {

//        LevelDBAggregationRepository RepoSorter;
//
//        File file = new File("data/SorterDb");
//        LevelDBFile levelDBFile = new LevelDBFile();
//        levelDBFile.setFile(file);
//        levelDBFile.start();
//        
//        RepoSorter = new LevelDBAggregationRepository("sorterdb", "data/SorterDb");

        from("netty4:tcp://localhost:5150?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg") //te1 //185.65.22.28 &sync=true
                .choice()
                .when(simple("${body} is 'ru.cse.proxysorter.Message.Request11'")).to("direct:Request11") 
                .when(simple("${body} is 'ru.cse.proxysorter.Message.Request13'")).to("direct:Request13")
                    .otherwise().to("direct:RequestANY");  
        
   //Получили исходные данные, надо отправить запрос в 1с и сохранить соспоставление PLU - Штрихкод     
        from("direct:Request11")
                .process(new ProcessorRequestSorter())
                .to("cxf:bean:reportIncident")
                .process(new ProcessorRequest1C())
                .to(ExchangePattern.InOnly,"activemq:queue:Sorter.Meashure")
                .to(ExchangePattern.InOnly,"seda:SaveToRepoSorter")
                //.multicast().to("seda:SaveToRepoSorter=InOnly","activemq:queue:Sorter.Meashure?exchangePattern=InOnly",)
                //.multicast().to("seda:SaveToRepoSorter=InOnly","activemq:queue:Sorter.Meashure?exchangePattern=InOnly").end()
                ;

//Получили исходные данные, надо отправить запрос в 1с, предварительно сконвертировав PLU в Штрихкод
        from("direct:Request13")
                .process(new ProcessorRequestSorter())
                .multicast().to("cxf:bean:reportIncident","mock:result").end()
                
                .process(new ProcessorRequest1C())
                ;
//Все остальные операции, смена мешка и т.д.
        from("direct:RequestANY")
                .process(new ProcessorRequestSorter())
                .to("cxf:bean:reportIncident")
                .process(new ProcessorRequest1C())
                ;
        
//Сохраним значение сопоставления PLU - штрих код        
        from("seda:SaveToRepoSorter")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchng) throws Exception {
                        //Exchange StoreExchange = new DefaultExchange(exchng.getContext());
                        Message in = exchng.getIn();                        
                        in.setBody(exchng.getProperty("Barcode"));
                        in.setHeader(CacheConstants.CACHE_KEY, exchng.getProperty("ProductCode"));
                        in.setHeader(CacheConstants.CACHE_OPERATION, CacheConstants.CACHE_OPERATION_ADD);
                    };})
                .to("cache://SorterPluBarcodeCache"
                        + "?maxElementsInMemory=1000"
                        +"&memoryStoreEvictionPolicy=MemoryStoreEvictionPolicy.FIFO" 
                        +"&overflowToDisk=true" 
                        +"&eternal=true" 
                        +"&timeToLiveSeconds=300" 
//                        +"&timeToIdleSeconds=true" 
                        +"&diskPersistent=true" 
                        +"&diskExpiryThreadIntervalSeconds=300"
                );
    }
}
