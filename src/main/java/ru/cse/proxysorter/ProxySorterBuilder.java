/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import ru.cse.APILk.Service1c.GetDataPushExit;
import ru.cse.APILk.Service1c.GetDataPushExitResponse;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Responce12;

/**
 *
 * @author Oleynik
 */
public class ProxySorterBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        GetDataPushExit ok = new GetDataPushExit();
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
               Request11 Req = exchange.getIn().getBody(Request11.class);
               //ok.setLanguage("Ru");
               //ok.setLogin("AnyDocumentTrackingClient");
               //ok.setPassword("AnyDocumentTrackingClient");
               //ok.setDocuments(Req.getBarcode());
               //ok.setType("waybill");
                  Message Out = exchange.getOut();
                  Out.setBody(ok);
                  Out.setHeader(CxfConstants.OPERATION_NAME, "GetDataPushExit");
                  Out.setHeader(CxfConstants.OPERATION_NAMESPACE,"http://www.cse-cargo.ru/client"); 
             }
               })
           .to("cxf:bean:reportIncident")
               .process(new Processor() {
              @Override
             public void process(Exchange exchange) throws Exception {
                 
                  Message In = exchange.getIn();
                  GetDataPushExitResponse TrR = In.getBody(GetDataPushExitResponse.class);
                  //Responce12 ret = new Responce12();
                  //ret.setCommand();
                  System.out.println(TrR.getReturn());
             }
               })               
            //.convertBodyTo();//
            .to("mock:Result");
    }
}
