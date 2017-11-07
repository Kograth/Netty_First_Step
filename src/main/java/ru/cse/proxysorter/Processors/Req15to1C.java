package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import ru.cse.APILk.Service1c.GetDataPushExit;
import ru.cse.APILk.Service1c.ReplacingTheBag;
import ru.cse.proxysorter.Message.Request15;

public class Req15to1C implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {

        Request15 Req15 = exchange.getIn().getBody(Request15.class);
        String PackBarCode = String.valueOf(Req15.getBarcode());
        GetDataPushExit To1C = new GetDataPushExit();
        To1C.setInParametrs(PackBarCode);
        Message Out = exchange.getOut();
        Out.setBody(To1C);
        Out.setHeader(CxfConstants.OPERATION_NAME, "GetDataPushExit");
        Out.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.cse-cargo.ru/client"); }

}
