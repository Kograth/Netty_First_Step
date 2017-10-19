/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

import java.lang.Exception;

import org.apache.camel.component.leveldb.LevelDBAggregationRepository;
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

        //LevelDBAggregationRepository repo = new LevelDBAggregationRepository("repo1", "target/data/leveldb.dat");

       from("netty4:tcp://localhost:5150?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true") //te1
            .process(new ProcessorRequestSorter())
           // .wireTap("direct:start")
               //.wireTap("direct:incoming")
           .to("cxf:bean:reportIncident")
               .process(new ProcessorRequest1C());
      //Отправка в activeMQ
        //from("direct:incoming").process()
           //.to("activemq:queue:test-queue");
        /*from("direct:start").aggregate(header("id"),new MyAggregationStrategy())
                .completionSize(5).aggregationRepository(repo)
                .to("mock:aggregated");*/
        //Коннект по второму порту проверенно работает.
        /*from("netty4:tcp://te1:5151?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg") //te1
                .process(new ProcessorRequestSorter())
                //.wireTap("direct:incoming")
                .to("cxf:bean:reportIncident")
                .process(new ProcessorRequest1C());*/


            //.convertBodyTo();//
            //.to("activemq:queue:test-queue");

    }
}
