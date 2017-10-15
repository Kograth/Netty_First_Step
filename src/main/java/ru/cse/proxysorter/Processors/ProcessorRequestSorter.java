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

public class ProcessorRequestSorter implements Processor {

    public int ProductCode = 5555;
    public short CommandCode = 0x11;
    
    @Override
    public void process(Exchange exchange) throws Exception {
        Request11 Req11 = exchange.getIn().getBody(Request11.class);
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
            Out.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.cse-cargo.ru/client");
            exchange.setProperty("CommandCode", CommandCode);
            exchange.setProperty("ProductCode", ProductCode);
        }
        if (!(Req13 == null)) {

            ProductCode = Req13.getCodeProduct();
            CommandCode = Req13.getCommand();

            String ExitNumber = String.valueOf(Req13.getExitNumber());

            ProductDelivery ParametersOUT14 = new ProductDelivery();
            ParametersOUT14.setInParametrs(ExitNumber);
            Message Out = exchange.getOut();
            Out.setBody(ParametersOUT14);
            Out.setHeader(CxfConstants.OPERATION_NAME, "ProductDelivery");
            Out.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.cse-cargo.ru/client");
            exchange.setProperty("SourceSort", Req13.getSource());
            exchange.setProperty("CommandCode", CommandCode);
            exchange.setProperty("ProductCode", ProductCode);
            
        }
        if (!(Req15 == null)) {
            //Режим работы команды не согласован
        }

        //Событие отправленное ТСД
        //Код события 111
        if (!(Req17 == null)) {

            CommandCode = Req17.getCommand();

            String ExitNumber = String.valueOf(Req17.getExitNumber());
            String BagBarCode = String.valueOf(Req17.getBagBarCode());

            ReplacingTheBag ParametersOUT18 = new ReplacingTheBag();

            ParametersOUT18.setBagCode(BagBarCode);
            ParametersOUT18.setExitNumber(ExitNumber);
            ParametersOUT18.setInParametrs("From 111");
            Message Out = exchange.getOut();
            Out.setBody(ParametersOUT18);
            Out.setHeader(CxfConstants.OPERATION_NAME, "ReplacingTheBag");
            Out.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.cse-cargo.ru/client");
            exchange.setProperty("ExitForNewBag", ExitNumber);
            exchange.setProperty("CommandCode", CommandCode);
            exchange.setProperty("ProductCode", ProductCode);
        }

    }
}
