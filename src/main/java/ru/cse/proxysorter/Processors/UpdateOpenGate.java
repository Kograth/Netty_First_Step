package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import ru.cse.proxysorter.Message.Request17;
import ru.cse.proxysorter.Message.Response18;

public class UpdateOpenGate implements AggregationStrategy {
    @Override
    public Exchange aggregate(Exchange original,Exchange modify) {
        //Создадим класс из данных ТСД
        Request17 Req17 = modify.getIn().getBody(Request17.class);
        //Установим новое значение выхода в оригинальное сообщение
        Message in  = original.getIn();
        Response18 Req18  = in.getBody(Response18.class);
        Req18.setExitNumber(Req17.getExitNumber());
        //Упаковать сообщение и отправить в поток
        original.getIn().setBody(Req18);
        return original;
    }
}
