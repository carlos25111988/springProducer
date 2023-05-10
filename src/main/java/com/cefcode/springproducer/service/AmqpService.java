package com.cefcode.springproducer.service;

import com.cefcode.springproducer.dto.MessageDTO;

public interface AmqpService {
    void sendToConsumer(MessageDTO message);
}
