package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import ru.cse.proxysorter.Message.Request17;
import ru.cse.proxysorter.Message.Request19;


public class Req19ToResp20 implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        Request19 Req19 = exchange.getIn().getBody(Request19.class);


    }
}
