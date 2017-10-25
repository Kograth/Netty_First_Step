/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import ru.cse.APILk.Service1c.GetDataPushExitResponse;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Request13;
import ru.cse.proxysorter.Message.Request15;
import ru.cse.proxysorter.Message.Request17;
import ru.cse.proxysorter.Message.Responce12;
import ru.cse.proxysorter.Message.Response14;
import ru.cse.proxysorter.Message.Response18;
import java.lang.Exception;

/**
 *
 * @author 1
 */
public class ProcessorRequest1C implements Processor {

    short CommandCode = 0x11;
    int ProductCode;
    @Override
    public void process(Exchange exchange) throws Exception {

        Message In = exchange.getIn();
        CommandCode = (short) exchange.getProperty("CommandCode");
        ProductCode = (int) exchange.getProperty("ProductCode");

        //Взависимости от входящей команды выберим как будем отвечать
        if (CommandCode == Request11.MESSAGE_CODE) {
            GetDataPushExitResponse TrR = In.getBody(GetDataPushExitResponse.class);
            //Получим ответные параметры из 1с
            String ExitNumber = TrR.getSendExitNumber();
            String OutBarcode = TrR.getSendBarcode();
            Byte byteExitNumber = Byte.valueOf(ExitNumber);
            //Запишем свойство в сообщение
            exchange.setProperty("Barcode", OutBarcode);
            //
            Responce12 returnAnswer = new Responce12();
            returnAnswer.setExitNumber(byteExitNumber);
            returnAnswer.setCodeProduct(ProductCode);
            returnAnswer.ToByte();
            Message Out = exchange.getOut();
            Out.setBody(returnAnswer);
        }
        if (CommandCode == Request13.MESSAGE_CODE) {
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
}
