/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import ru.cse.APILk.Service1c.GetDataPushExitResponse;
import ru.cse.proxysorter.Message.Request11;

/**
 *
 * @author Oleynik
 */
public class Req11And1CAgregate implements AggregationStrategy{

    @Override
    public Exchange aggregate(Exchange original, Exchange resource) {
        Request11 originalBody = (Request11) original.getIn().getBody(Request11.class);
        GetDataPushExitResponse resourceResponse = (GetDataPushExitResponse) resource.getIn().getBody(GetDataPushExitResponse.class);
        Request11 mergeResult = originalBody;
        String bsrcode = (String) resourceResponse.getSendBarcode();
        short exitNumber = (short) resourceResponse.getSendExitNumber();
        originalBody.setBarcode1С(bsrcode);
        originalBody.setExitNumber(exitNumber);
        if (original.getPattern().isOutCapable()) {
            original.getOut().setBody(mergeResult);
        } else {
            original.getIn().setBody(mergeResult);
        }
        return original;        
    }
    
}
