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
import ru.cse.APILk.Service1c.*;
;
import ru.cse.proxysorter.Message.*;

import java.lang.Exception;
import java.util.*;
import java.util.Map;

/**
 *
 * @author Oleynik
 */
public class ProxySorterBuilder extends RouteBuilder {

    public int ProductCode = 5555;
    public short CommandCode = 0x11;

    @Override
    public void configure() throws Exception {


       from("netty4:tcp://te1:5150?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true") //te1
            .process(new Processor() {
              @Override
             public void process(Exchange exchange) throws Exception {
                  Request11 Req11  = exchange.getIn().getBody(Request11.class);
                  Request13 Req13 = exchange.getIn().getBody(Request13.class);
                  Request15 Req15 = exchange.getIn().getBody(Request15.class);
                  Request17 Req17 = exchange.getIn().getBody(Request17.class);


                  if (!(Req11 == null)) {

                      GetDataPushExit ParametersOUT = new GetDataPushExit();
                      ProductCode = Req11.getCodePLK();
                      CommandCode = Req11.getCommand();

                      //Установим параметр 1С
                      ParametersOUT.setInParametrs(Req11.getBarcode());

                      //Отправляем ответ в 1с
                      Message Out = exchange.getOut();
                      Out.setBody(ParametersOUT);
                      Out.setHeader(CxfConstants.OPERATION_NAME, "GetDataPushExit");
                      Out.setHeader(CxfConstants.OPERATION_NAMESPACE,"http://www.cse-cargo.ru/client");
                  }
                  if (!(Req13 == null)) {

                      ProductCode = Req13.getCodeProduct();
                      CommandCode = Req13.getCommand();

                      String ExitNumber = new String(String.valueOf(Req13.getExitNumber()));

                      ProductDelivery ParametersOUT14 = new ProductDelivery();
                      ParametersOUT14.setInParametrs(ExitNumber);
                      Message Out = exchange.getOut();
                      Out.setBody(ParametersOUT14);
                      Out.setHeader(CxfConstants.OPERATION_NAME, "ProductDelivery");
                      Out.setHeader(CxfConstants.OPERATION_NAMESPACE,"http://www.cse-cargo.ru/client");
                      exchange.setProperty("SourceSort",Req13.getSource());
                  }
                  if (!(Req15 == null)) {
                        //Режим работы команды не согласован
                  }

                  //Событие отправленное ТСД
                  //Код события 111
                  if (!(Req17 == null)) {

                      CommandCode = Req17.getCommand();

                      String ExitNumber = new String(String.valueOf(Req17.getExitNumber()));
                      String BagBarCode = new String(String.valueOf(Req17.getBagBarCode()));

                      ReplacingTheBag ParametersOUT18 = new ReplacingTheBag();

                      ParametersOUT18.setBagCode(BagBarCode);
                      ParametersOUT18.setExitNumber(ExitNumber);
                      ParametersOUT18.setInParametrs("From 111");
                      Message Out = exchange.getOut();
                      Out.setBody(ParametersOUT18);
                      Out.setHeader(CxfConstants.OPERATION_NAME, "ReplacingTheBag");
                      Out.setHeader(CxfConstants.OPERATION_NAMESPACE,"http://www.cse-cargo.ru/client");
                      exchange.setProperty("ExitForNewBag",ExitNumber);
                  }

             }
               })
            //.wireTap("direct:incoming")
           .to("cxf:bean:reportIncident")
               .process(new Processor() {
              @Override
             public void process(Exchange exchange) throws Exception {

                  Message In = exchange.getIn();

                  //Взависимости от входящей команды выберим как будем отвечать
                  if (CommandCode == Request11.MESSAGE_CODE) {
                      GetDataPushExitResponse TrR = In.getBody(GetDataPushExitResponse.class);
                      //Получим ответные параметры из 1с
                      String ExitNumber = TrR.getSendExitNumber();
                      String OutBarcode = TrR.getSendBarcode();
                      Byte byteExitNumber = Byte.valueOf(ExitNumber);
                      //Запишем свойство в сообщение
                      exchange.setProperty(OutBarcode,ProductCode);
                      //
                      Responce12 returnAnswer = new Responce12();
                      returnAnswer.setExitNumber(byteExitNumber);
                      returnAnswer.setCodeProduct(ProductCode);
                      returnAnswer.ToByte();
                      Message Out = exchange.getOut();
                      Out.setBody(returnAnswer);
                  }
                  if (CommandCode == Request13.MESSAGE_CODE){
                        Response14 returnAnswer = new Response14();
                        returnAnswer.SetSource((Short) exchange.getProperty("SourceSort"));
                        returnAnswer.SetCodeProduct(ProductCode);
                        returnAnswer.ToByte();
                        Message Out = exchange.getOut();
                        Out.setBody(returnAnswer);
                  }
                  if (CommandCode == Request15.MESSAGE_CODE) {
                        //Режим работы команды не согласован
                  }
                  //Отправим событие ТСД в поток сортировщика
                  //Код события 111
                  if (CommandCode == Request17.MESSAGE_CODE) {
                      //ReplacingTheBag AnswerFrom1C = In.getBody(ReplacingTheBag.class);
                      Response18 returnAnswer = new Response18();
                      //String PropertyExit = new String(exchange.getProperty("ExitForNewBag"));
                      byte exit = 91;
                      returnAnswer.setExitNumber(exit);
                      returnAnswer.ToByte();
                      Message Out = exchange.getOut();
                      Out.setBody(returnAnswer);

                  }



             }
               });
      // from("direct:incoming").to("activemq:queue:test-queue");



            //.convertBodyTo();//
            //.to("activemq:queue:test-queue");

    }
}
