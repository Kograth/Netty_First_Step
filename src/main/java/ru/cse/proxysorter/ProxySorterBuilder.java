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
import ru.cse.APILk.Service1c.Array;
import ru.cse.APILk.Service1c.GetDataPushExit;
import ru.cse.APILk.Service1c.GetDataPushExitResponse;
;
import ru.cse.APILk.Service1c.Structure;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Request13;
import ru.cse.proxysorter.Message.Request15;
import ru.cse.proxysorter.Message.Responce12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Oleynik
 */
public class ProxySorterBuilder extends RouteBuilder {

    public int ProductCode = 0;
    public short CommandCode = 0x11;

    @Override
    public void configure() throws Exception {

        GetDataPushExit ParametersOUT = new GetDataPushExit();

       from("netty4:tcp://localhost:5150?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true")
            .process(new Processor() {
              @Override
             public void process(Exchange exchange) throws Exception {
                  Request11 Req  = exchange.getIn().getBody(Request11.class);
                  Request13 Req2 = exchange.getIn().getBody(Request13.class);
                  Request15 Req3 = exchange.getIn().getBody(Request15.class);


                  ProductCode = Req.getCodePLK();
                  CommandCode = Req.getCommand();

                  //Установим параметр 1С
                  ParametersOUT.setInParametrs(Req.getBarcode());
                  //ParametersOUT.setInputStruc(GreatMassiv);

                  //Отправляем ответ в 1с
                  Message Out = exchange.getOut();
                  Out.setBody(ParametersOUT);
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
                  //Получим ответные параметры из 1с
                  String ExitNumber = TrR.getSendExitNumber();

                  Byte byteExitNumber = Byte.valueOf(ExitNumber);
                  //Взависимости от входящей команды выберим как будем отвечать
                  if (CommandCode == Request11.MESSAGE_CODE) {
                      Responce12 returnAnswer = new Responce12();
                      returnAnswer.setExitNumber(byteExitNumber);
                      returnAnswer.setCodeProduct(ProductCode);
                      returnAnswer.ToByte();
                      Message Out = exchange.getOut();
                      Out.setBody(returnAnswer);
                  }
                  if (CommandCode == Request13.MESSAGE_CODE){

                  }
                  if (CommandCode == Request15.MESSAGE_CODE) {

                  }


             }
               });
            //.convertBodyTo();//
            //.to("mock:Result");
    }
}
