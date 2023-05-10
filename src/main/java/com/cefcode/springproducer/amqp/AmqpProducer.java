package com.cefcode.springproducer.amqp;

public interface AmqpProducer {
    <T> void producer(T message);
}
