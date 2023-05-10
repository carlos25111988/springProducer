package com.cefcode.springproducer.service.impl;

import com.cefcode.springproducer.amqp.AmqpProducer;
import com.cefcode.springproducer.dto.MessageDTO;
import com.cefcode.springproducer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl implements AmqpService {

    @Autowired
    private AmqpProducer amqp;

    @Override
    public void sendToConsumer(MessageDTO message) {
        amqp.producer(message);
    }
}
