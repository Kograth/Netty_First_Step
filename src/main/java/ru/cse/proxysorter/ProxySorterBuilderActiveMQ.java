package ru.cse.proxysorter;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.DefaultErrorHandlerBuilder;
import org.apache.camel.builder.RouteBuilder;

public class ProxySorterBuilderActiveMQ  extends RouteBuilder{
    @Override
    public void configure() throws Exception {

        errorHandler(defaultErrorHandler()
                .maximumRedeliveries(-1)
                .backOffMultiplier(2)
                .delayPattern("5:10000;10:60000;20:1800000")
                .useExponentialBackOff()
                .retryAttemptedLogLevel(LoggingLevel.WARN));


        from("activemq:queue:Sorter.1CReplacingTheBag").to("cxf:bean:reportIncident");



    }
}
