/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import ru.cse.proxysorter.Message.Request17;
import ru.cse.proxysorter.Message.Response18;

/**
 *
 * @author Oleynik
 */
public class Req17ToResp18 implements Processor{

    @Override
    public void process(Exchange exchng) throws Exception {
        Response18 returnAnswer = new Response18();
        Request17 Req17 = exchng.getIn().getBody(Request17.class);
        returnAnswer.setExitNumber(Req17.getExitNumber());
    }
    
}
