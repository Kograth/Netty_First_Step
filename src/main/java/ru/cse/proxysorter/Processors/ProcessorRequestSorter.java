/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Processors;

/**
 *
 * @author 1
 */
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import ru.cse.APILk.Service1c.*;
import ru.cse.proxysorter.Message.*;
import java.lang.Exception;
import ru.cse.proxysorter.ConstantsSorter;

public class ProcessorRequestSorter implements Processor {

 
    
    @Override
    public void process(Exchange exchange) throws Exception {
        int ProductCode;
        short CommandCode; 

        Request11 Req11 = exchange.getIn().getBody(Request11.class);
        Request13 Req13 = exchange.getIn().getBody(Request13.class);
        Request15 Req15 = exchange.getIn().getBody(Request15.class);
        Request111 Req111 = exchange.getIn().getBody(Request111.class);
        Response18 Req18 = exchange.getIn().getBody(Response18.class);

        if (!(Req11 == null)) {

            GetDataPushExit ParametersOUT = new GetDataPushExit();
            ProductCode = Req11.getCodePLK();
            CommandCode = Req11.getCommand();

            //Установим параметр 1С
            String BarCodeFrom = Req11.getBarcode();
            ParametersOUT.setInParametrs(BarCodeFrom);

            //Отправляем ответ в 1с
            Message Out = exchange.getOut();
            Out.setBody(ParametersOUT);
            Out.setHeader(CxfConstants.OPERATION_NAME, "GetDataPushExit");
            Out.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.cse-cargo.ru/client");
            //Out.setHeader("I_get_Barcode",BarCodeFrom+" lenght "+BarCodeFrom.length());
//            if (BarCodeFrom.length()==0) {
//                Out.setHeader("BarCodeEmpty","0");
//            }
//            else {
//                Out.setHeader("BarCodeEmpty","1");
//            }
            exchange.setProperty(ConstantsSorter.PROPERTY_COMANDCODE, CommandCode);
            exchange.setProperty(ConstantsSorter.PROPERTY_PLK, ProductCode);
        }
        if (!(Req13 == null)) {

            ProductCode = Req13.getCodeProduct();
            CommandCode = Req13.getCommand();
            
            String ExitNumber = String.valueOf(Req13.getExitNumber());

            ProductDelivery ParametersOUT14 = new ProductDelivery();
            ParametersOUT14.setInParametrs(ExitNumber);
            ParametersOUT14.setProductCode(String.valueOf(ProductCode));
            Message Out = exchange.getOut();
            Out.setBody(ParametersOUT14);
            Out.setHeader(CxfConstants.OPERATION_NAME, "ProductDelivery");
            Out.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.cse-cargo.ru/client");
            exchange.setProperty("SourceSort", Req13.getSource());
            exchange.setProperty(ConstantsSorter.PROPERTY_COMANDCODE, CommandCode);
            exchange.setProperty(ConstantsSorter.PROPERTY_PLK, ProductCode);
            
        }
        if (!(Req15 == null)) {
            //Режим работы команды не согласован
        }

        //Установка мешка отправляем сообщение Сортировщику
        if (!(Req18 == null)) {

            Response18 returnAnswer = new Response18();

            returnAnswer.setExitNumber(returnAnswer.getExitNumber());
            returnAnswer.ToByte();
            Message Out = exchange.getOut();
            Out.setBody(returnAnswer);

        }

        //Событие отправленное ТСД
        //Код события 111
        if (!(Req111 == null)) {

            CommandCode = Req111.getCommand();

            String ExitNumber = String.valueOf(Req111.getExitNumber());
            String BagBarCode = String.valueOf(Req111.getBagBarCode());

            ReplacingTheBag ParametersOUT18 = new ReplacingTheBag();

            ParametersOUT18.setBagCode(BagBarCode);
            ParametersOUT18.setExitNumber(ExitNumber);
            ParametersOUT18.setInParametrs(BagBarCode);
            Message Out = exchange.getOut();
            Out.setBody(ParametersOUT18);
            Out.setHeader(CxfConstants.OPERATION_NAME, "ReplacingTheBag");
            Out.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.cse-cargo.ru/client");
            //exchange.setProperty("ExitForNewBag", ExitNumber);
            //exchange.setProperty(ConstantsSorter.PROPERTY_COMANDCODE, CommandCode);
            //exchange.setProperty(ConstantsSorter.PROP ERTY_PLK, ProductCode);
        }

    }
}
