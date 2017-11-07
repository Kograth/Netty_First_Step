/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Processors;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import ru.cse.proxysorter.Message.Request11;

public class ProcessorRequest1CIT extends CamelTestSupport {
    @Test
    public void testMSG11To12() throws Exception {
        MockEndpoint endpoint = getMockEndpoint("mock:results");
        endpoint.expectedMessageCount(1);
        Request11 msg11 = new Request11();
        
        endpoint.message(0).body().startsWith("Hello World");

        assertMockEndpointsSatisfied();
    }
}
