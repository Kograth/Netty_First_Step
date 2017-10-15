/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter;
import org.apache.camel.builder.RouteBuilder;

import java.lang.Exception;
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

       from("netty4:tcp://localhost:5150?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true") //te1
            .process(new ProcessorRequestSorter())
            //.wireTap("direct:incoming")
           .to("cxf:bean:reportIncident")
               .process(new ProcessorRequest1C());
      // from("direct:incoming").to("activemq:queue:test-queue");



            //.convertBodyTo();//
            //.to("activemq:queue:test-queue");

    }
}
