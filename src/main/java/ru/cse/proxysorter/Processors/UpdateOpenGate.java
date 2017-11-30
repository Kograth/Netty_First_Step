package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class UpdateOpenGate implements AggregationStrategy {
    @Override
    public Exchange aggregate(Exchange original,Exchange modify) {
        return null;
    }
}
