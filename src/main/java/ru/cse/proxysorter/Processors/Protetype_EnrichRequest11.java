package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import ru.cse.proxysorter.Message.Response12;
import sun.security.pkcs11.wrapper.Constants;

public class Protetype_EnrichRequest11 implements AggregationStrategy {
    @Override
    public Exchange aggregate(Exchange OldMsg,Exchange NewMsg) {
        if (NewMsg == null) {
            return OldMsg;
        }

        Response12 Req12 = NewMsg.getIn().getBody(Response12.class);

        OldMsg.getIn().setBody(Req12);
        return OldMsg;
    }
}
