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
import org.apache.camel.processor.aggregate.AggregationStrategy;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Request17;
import ru.cse.proxysorter.Message.Response14;
import ru.cse.proxysorter.Processors.*;



/**
 *
 * @author Oleynik
 */
public class ProxySorterBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        //********************************************************
        // Секция команды 11

        from("netty4:tcp://localhost:4991?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true") //te1 //185.65.22.28 //10.0.0.137
                .to("direct:Request11")
                ;
                //.enrich("netty4:tcp://localhost:4991")
                /*.choice()
                .when(simple("${body} is 'ru.cse.proxysorter.Message.Request11'")).to("direct:Request11").endChoice()
                .when(simple("${body} is 'ru.cse.proxysorter.Message.Request13'")).to("direct:Request13").endChoice()
                .when(simple("${body} is 'ru.cse.proxysorter.Message.Request17'")).to("direct:Request17").endChoice()
                .when(simple("${body} is 'ru.cse.proxysorter.Message.Request111'")).to("direct:Request111").endChoice()
                    .otherwise().to("direct:RequestANY").end()*/
                //.to("netty4:tcp://localhost:49541?encoders=#length-EncoderSorterTlg&sync=false")

        //********************************************************


        //********************************************************
        // Секция команды 13

        from("netty4:tcp://localhost:4992?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true") //&encoders=#length-EncoderSorterTlg
                .to("direct:Request13");

        //********************************************************

        from("netty4:tcp://localhost:5200?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=false")
                .to("direct:Request111").end();

        //********************************************************
        // Секция открытия выхода

        //Открыть выход запрос с ПЛС
        from("netty4:tcp://localhost:4993?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true")
                .pollEnrich("seda:enrichMessage",-1,new UpdateOpenGate());


        //Сообщения от ТСД
        from("netty4:tcp://localhost:5117?decoders=#length-DecoderSorterTlg&sync=false")
                .choice()
                .when(simple("${body} is 'ru.cse.proxysorter.Message.Request17'")).to("seda:enrichMessage");


        from("seda:enrichMessage?multipleConsumers=true")
                .process(new UpdateOpenGateProcessor())
                .to("log:Request17");
        //***********************************************************

        //Закрытие выхода
        from("netty4:tcp://localhost:5119?decoders=#length-DecoderSorterTlg&sync=false")
                .to("direct:Request19").end();

        //Получили исходные данные, надо отправить запрос в 1с и сохранить соспоставление PLU - Штрихкод
        from("direct:Request11")
                .enrich("direct:RequestFrom1c",new Req11And1CAgregate())
                .to(ExchangePattern.InOnly,"direct:SaveToRepoSorter")
                .to(ExchangePattern.InOnly,"activemq:queue:Sorter.Meashure")
                .to("log:Request11")
                .process(new Req11toResp12())
                .to("log:Request11")
                ;

//Получили исходные данные, надо отправить запрос в 1с, предварительно сконвертировав PLU в Штрихкод
        from("direct:Request13")
                .process(new ProcessorRequestSorter())
                .to("seda:ReadToRepoSorter")
                .to("cxf:bean:reportIncident")
                .process(new ProcessorRequest1C())
                ;
        

////17 команда открытия выхода
//        from("direct:Request17")
//                .process(new Req17ToResp18())
//                .to("netty4:tcp://localhost:14995?encoders=#length-EncoderSorterTlg&sync=false").end()
//                ;
//// 19 команда закрытия выхода
//        from("direct:Request19")
//                .process(new Req19ToResp20())
//                .to("netty4:tcp://localhost:14996?encoders=#length-EncoderSorterTlg&sync=false");


//111 код снятия мешка с ТСД отправляемый в 1C
        from("direct:Request111")
           .process(new Req111To1C()).end();

//Все остальные операции, смена мешка и т.д.
        from("direct:RequestANY")
                .process(new ProcessorRequestSorter())
                .to("cxf:bean:reportIncident")
                .process(new ProcessorRequest1C())
                ;
        
//Прочитаем сопоставление PLU Штрих код
        from("seda:ReadToRepoSorter")
                .choice().when(exchangeProperty("ProductCode").isNotNull()).to("direct:BadEnrich")
                    .setHeader(CacheConstants.CACHE_KEY, exchangeProperty("ProductCode"))
                    .setHeader(CacheConstants.CACHE_OPERATION, constant(CacheConstants.CACHE_OPERATION_GET))
                    .enrich ( "cache://SorterPluBarcodeCache" , new Req13Agregate())
                .endChoice();

        from("direct:BadEnrich")
                .process(new Expression());



//Сохраним значение сопоставления PLU - штрих код        
        from("direct:SaveToRepoSorter")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchng) throws Exception {
                        //Exchange StoreExchange = new DefaultExchange(exchng.getContext());
                        Message in = exchng.getIn();
                        Request11 resourceResponse =  in.getBody(Request11.class);
                        //in.setBody(exchng.getProperty(ConstantsSorter.PROPERTY_BARCODE));
                        in.setHeader(CacheConstants.CACHE_KEY, resourceResponse.getCodePLK());
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
        
// своего рода подзапрос в 1с для получения правильного штрих кода и номера выхода
       from("direct:RequestFrom1c")
                .process(new ProcessorRequestSorter())               
                .to("cxf:bean:reportIncident")
               .process(new Processor(){
            @Override
            public void process(Exchange exchng) throws Exception {
                Message in = exchng.getIn();
            }
        })
              ;
        
 //Отправим весогабариты в 1с
        from("activemq:queue:Sorter.Meashure")
                //.to("seda:ReadToRepoSorter")
                .process(new Processor13ToMeashure())
                .to("cxf:bean:MeashurementIncident");
    }
}
//                .to("netty4:tcp://localhost:6789?encoders=#length-EncoderSorterTlg&sync=false").end()
                ;
