package com.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
  
@Service
public class KafkaConsumer {
  
    @KafkaListener(topics = "poc-publicador",groupId = "group-id")
    public void
    consume(String message) {
        System.out.println("message = " + message);
    }
}
