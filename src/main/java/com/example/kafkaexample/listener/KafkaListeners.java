package com.example.kafkaexample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "rabiikafka", groupId = "listenersGroup")
    void listener(String data) {
        System.out.println("Listener received: " + data + " (°_?_°)");
    }

}
