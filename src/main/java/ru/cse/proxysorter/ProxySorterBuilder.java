/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

/**
 *
 * @author Oleynik
 */
public class ProxySorterBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
//      errorHandler(defaultErrorHandler()
//                .maximumRedeliveries(3)
//                .backOffMultiplier(4)
//                .retryAttemptedLogLevel(LoggingLevel.WARN));
       from("netty4:tcp://localhost:5150?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true")
            .process(new Processor() {
              @Override
             public void process(Exchange exchange) throws Exception {
               
                exchange.getOut().setBody(exchange.getIn().getBody()) ;
             }
               })            
           .to("cxfbean:itemRestService");
            //.convertBodyTo();//.to("mock:Result");

  
    }
}
