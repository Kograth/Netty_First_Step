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
import ru.cse.proxysorter.Message.Responce12;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author Oleynik
 */
public class ProxySorterBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        GetDataPushExit ParametersOUT = new GetDataPushExit();

       from("netty4:tcp://localhost:5150?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true")
            .process(new Processor() {
              @Override
             public void process(Exchange exchange) throws Exception {
                  Request11 Req = exchange.getIn().getBody(Request11.class);

                  //Заполнив выходной массив параметров
                  Array GreatMassiv = new Array();
                  GreatMassiv.getValue().add(Req.getCommand()); //НомерКоманды
                  //Для теста надо использовать заполненный массив байт параметры null передаются в 1с с ошибкой.
                  GreatMassiv.getValue().add(Req.getBarcode()); //Штрихкод

                  //Еще один параметр сервиса про запас не обязательный
                  ParametersOUT.setInParametrs("56");
                  ParametersOUT.setInputStruc(GreatMassiv);

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
                  String Answer = TrR.getOutParametrs();
                  Responce12 ret = new Responce12();
                  ret.ToByte();
                  Message Out = exchange.getOut();
                  Out.setBody(ret);

             }
               });
            //.convertBodyTo();//
            //.to("mock:Result");
    }
}
