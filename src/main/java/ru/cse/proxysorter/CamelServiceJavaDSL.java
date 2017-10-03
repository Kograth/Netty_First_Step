package ru.cse.proxysorter;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

import static org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent;


public final class CamelServiceJavaDSL implements  CamelService{

    private static final String IN_ENDPOINT = "direct:in";
    private static final String OUT_ENDPOINT = "activemq:queue:test-queue";

    private CamelContext context;
    private ProducerTemplate producer;
    private ConsumerTemplate consumer;

    public CamelServiceJavaDSL() throws Exception {
        context = new DefaultCamelContext();

        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from(IN_ENDPOINT).to(OUT_ENDPOINT);
            }
        });

        //Добавим компонент для работы с ActiveMQ
        context.addComponent("activemq", activeMQComponent("tcp://localhost:8181"));


        producer = context.createProducerTemplate();
        consumer = context.createConsumerTemplate();

        //Запуск Верблюда
        context.start();
    }

    @Override
    public void send(String message) {
        producer.sendBody(IN_ENDPOINT, message);
    }

    @Override
    public String receive() {
        return (String) consumer.receiveBody(OUT_ENDPOINT);
    }
}
