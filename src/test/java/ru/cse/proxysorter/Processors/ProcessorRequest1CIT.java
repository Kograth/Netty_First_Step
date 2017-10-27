/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Processors;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.cse.proxysorter.Message.Request11;
/**
 *
 * @author 1
 */
public class ProcessorRequest1CIT extends CamelTestSupport {

    private Request11 Msg11;

    @EndpointInject(uri = "mock:result")
    protected MockEndpoint resultEndpoint;

    @Produce(uri = "direct:start")
    protected ProducerTemplate template;

    public ProcessorRequest1CIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    @Override
    public void setUp() {
        Msg11 = new Request11();
        Msg11.setBarcode("12314321432143214346");
        Msg11.setCodePLK(1234568);
        Msg11.setWeight((short) 0x12d688);
        Msg11.setLength((short) 1234568);
        Msg11.setHeight((short) 1234568);
        Msg11.setWidth((short) 1234568);
        Msg11.setStateWeight((short) 0x1);
        Msg11.setStateSize((short) 0x1);
        
    }
    
    @After
    @Override
    public void tearDown() {
    }

    /**
     * Test of process method, of class ProcessorRequest1C.
     * @throws java.lang.Exception
     */
    @Test
    public void testProcess() throws Exception {
        Msg11 = new Request11();
        Msg11.setBarcode("12314321432143214346");
        Msg11.setCodePLK(1234568);
        Msg11.setWeight((short) 0x12d688);
        Msg11.setLength((short) 1234568);
        Msg11.setHeight((short) 1234568);
        Msg11.setWidth((short) 1234568);
        Msg11.setStateWeight((short) 0x1);
        Msg11.setStateSize((short) 0x1);
        
        //Exchange StoreExchange = new DefaultExchange(exchng.getContext());
        resultEndpoint.expectedMessageCount(0);
        //resultEndpoint.expectedBodiesReceived("44");
        
        System.out.println("process");
        template.sendBodyAndHeader(Msg11, "foo", "notMatchedHeaderValue");
        
        //Exchange exchange = null;
        //ProcessorRequest1C myProcessor = new ProcessorRequest1C();
        //instance.process(exchange);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        resultEndpoint.assertIsSatisfied();        
    }
    
    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:start").process(new ProcessorRequest1C()).to("mock:result");
            }
        };
    }    
}
