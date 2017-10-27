/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import ru.cse.proxysorter.ConstantsSorter;

/**
 *
 * @author Oleynik
 */
public class Req13Agregate implements AggregationStrategy{

    @Override
    public Exchange aggregate(Exchange original, Exchange resource) {
        //Object originalBody = original.getIn().getBody();
        String resourceResponse = (String) resource.getIn().getBody();
        //Object mergeResult = originalBody;
        //String bsrcode = (String) resource.getProperty(ConstantsSorter.PROPERTY_BARCODE);
        original.setProperty(ConstantsSorter.PROPERTY_BARCODE, resourceResponse);
//        if (original.getPattern().isOutCapable()) {
//            original.getOut().setBody(mergeResult);
//        } else {
//            original.getIn().setBody(mergeResult);
//        }
        return original;
    }
    
}
