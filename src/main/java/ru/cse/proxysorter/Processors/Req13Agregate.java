/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import ru.cse.proxysorter.ConstantsSorter;
import ru.cse.proxysorter.Message.Request11;

/**
 *
 * @author Oleynik
 */
public class Req13Agregate implements AggregationStrategy{

    @Override
    public Exchange aggregate(Exchange original, Exchange resource) {
        Request11 resourceResponse =  resource.getIn().getBody(Request11.class);
        if (resourceResponse!= null) {
            original.setProperty(ConstantsSorter.PROPERTY_BARCODE,resourceResponse.getBarcode1С());
        }
        else
        {
            original.setProperty(ConstantsSorter.PROPERTY_BARCODE,"0000000000000");
        }
        return original;
    }

    
}
