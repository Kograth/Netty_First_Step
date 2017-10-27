/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter;

import org.apache.camel.builder.RouteBuilder;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cache.CacheConstants;
import ru.cse.proxysorter.Processors.ProcessorRequest1C;
import ru.cse.proxysorter.Processors.ProcessorRequestSorter;
import ru.cse.proxysorter.Processors.Req13Agregate;
import ru.cse.proxysorter.Processors.Req17ToResp18;

/**
 *
 * @author Oleynik
 */
public class ProxySorterBuilder extends RouteBuilder {

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

        from("netty4:tcp://localhost:5150?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=false") //te1 //185.65.22.28 
                .choice()
                .when(simple("${body} is 'ru.cse.proxysorter.Message.Request11'")).to("direct:Request11") 
                .when(simple("${body} is 'ru.cse.proxysorter.Message.Request13'")).to("direct:Request13")
                .when(simple("${body} is 'ru.cse.proxysorter.Message.Request17'")).to("direct:Request17")                
                    .otherwise().to("direct:RequestANY")
                ;  
        
   //Получили исходные данные, надо отправить запрос в 1с и сохранить соспоставление PLU - Штрихкод     
        from("direct:Request11")
                .process(new ProcessorRequestSorter())
                .to("cxf:bean:reportIncident")
                .process(new ProcessorRequest1C())
                .to(ExchangePattern.InOnly,"seda:SaveToRepoSorter")
                .to(ExchangePattern.InOnly,"activemq:queue:Sorter.Meashure")                
                .to("netty4:tcp://localhost:6789?encoders=#length-EncoderSorterTlg&sync=false")
                ;

//Получили исходные данные, надо отправить запрос в 1с, предварительно сконвертировав PLU в Штрихкод
        from("direct:Request13")
                .process(new ProcessorRequestSorter())
                .to("seda:ReadToRepoSorter")
                .to("cxf:bean:reportIncident")
                .process(new ProcessorRequest1C())
                .to("netty4:tcp://localhost:6789?encoders=#length-EncoderSorterTlg&sync=false")
                ;
        

//17 код замена мешка, в сортер отправлять ничего не надо, это только для 1с
        from("direct:Request17")
                .process(new Req17ToResp18())
                .to("netty4:tcp://localhost:6789?encoders=#length-EncoderSorterTlg&sync=false").end()
                ;        
//Все остальные операции, смена мешка и т.д.
        from("direct:RequestANY")
                .process(new ProcessorRequestSorter())
                .to("cxf:bean:reportIncident")
                .process(new ProcessorRequest1C())
                ;
        
//Прочитаем сопоставление PLU Штрих код
        from("seda:ReadToRepoSorter")
                .setHeader(CacheConstants.CACHE_KEY, exchangeProperty("ProductCode"))
                .setHeader(CacheConstants.CACHE_OPERATION, constant(CacheConstants.CACHE_OPERATION_GET))
                .enrich ( "cache://SorterPluBarcodeCache" , new Req13Agregate());


//Сохраним значение сопоставления PLU - штрих код        
        from("seda:SaveToRepoSorter")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchng) throws Exception {
                        //Exchange StoreExchange = new DefaultExchange(exchng.getContext());
                        Message in = exchng.getIn();                        
                        in.setBody(exchng.getProperty(ConstantsSorter.PROPERTY_BARCODE));
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
