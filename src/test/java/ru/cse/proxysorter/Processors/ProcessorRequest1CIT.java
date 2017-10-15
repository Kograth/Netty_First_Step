/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ru.cse.proxysorter.Message.Request11;

/**
 *
 * @author 1
 */
public class ProcessorRequest1CIT {
    private Request11 Msg11;
    public ProcessorRequest1CIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
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
    public void tearDown() {
    }

    /**
     * Test of process method, of class ProcessorRequest1C.
     */
    @Test
    public void testProcess() throws Exception {
        System.out.println("process");
        Exchange exchange = null;
        ProcessorRequest1C instance = new ProcessorRequest1C();
        instance.process(exchange);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
