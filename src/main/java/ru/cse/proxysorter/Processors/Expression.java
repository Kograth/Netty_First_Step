package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.ValueBuilder;
import ru.cse.proxysorter.Message.Request11;

import java.util.Map;

import static org.apache.camel.language.property.ExchangePropertyLanguage.exchangeProperty;

public class Expression implements Processor{


    @Override
    public void process(Exchange exchange) throws Exception {
        Message newMSG = exchange.getIn();
        Map<String, Object> STR= exchange.getProperties();
        //exchangeProperty("ProductCode");
    }
}
