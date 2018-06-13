package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.ehcache.EhcacheConstants;
import ru.cse.proxysorter.ConstantsSorter;

import static org.apache.camel.builder.Builder.constant;
import static org.apache.camel.builder.Builder.exchangeProperty;

public class testProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {

       // Message in  = exchange.getIn();
        exchange.getProperty(ConstantsSorter.PROPERTY_PLK);
//        in.setHeader(EhcacheConstants.ACTION, constant(EhcacheConstants.ACTION_GET));
//        in.setHeader(EhcacheConstants.KEY, 1627);//exchangeProperty(ConstantsSorter.PROPERTY_PLK))

    }
}
