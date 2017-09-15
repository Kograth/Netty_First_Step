/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter;


import java.util.ArrayList;
import java.util.List;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.SoapJaxbDataFormat;
import org.apache.camel.dataformat.soap.name.ServiceInterfaceStrategy;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import ru.cse.APILk.Service1c.Version;
import ru.cse.APILk.Service1c.WebServicesNewCSEPortType;

/**
 *
 * @author Oleynik
 */
public class ProxySorterBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        //Version ok = new Version();
        //SoapJaxbDataFormat soap = new SoapJaxbDataFormat("ru.cse.APILk.Service1c", new ServiceInterfaceStrategy(WebServicesNewCSEPortType.class,true));
        //soap.setVersion("1.2");
//      errorHandler(defaultErrorHandler()
//                .maximumRedeliveries(3)
//                .backOffMultiplier(4)
//                .retryAttemptedLogLevel(LoggingLevel.WARN));
       from("netty4:tcp://localhost:5150?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true")
            .process(new Processor() {
              @Override
             public void process(Exchange exchange) throws Exception {
               
                  List oList = new ArrayList();
                  oList.add("RU");
                  oList.add("login");
                  oList.add("pasword");
                  oList.add("Waybil");
                  oList.add("12345678");
//                exchange.getOut().setBody(exchange.getIn().getBody()) ;
                  Message Out = exchange.getOut();
                  Out.setBody(oList) ;
                  Out.setHeader(CxfConstants.OPERATION_NAME, "Tracking");
                  Out.setHeader(CxfConstants.OPERATION_NAMESPACE,"http://www.cse-cargo.ru/client");
             }
               })
            //.transform(constant(ok))
               //.marshal(soap)
              //.setHeader(CxfConstants.OPERATION_NAME, constant("Version"))
           .to("cxf:bean:reportIncident")
            //.convertBodyTo();//
            .to("mock:Result");
    }
}
