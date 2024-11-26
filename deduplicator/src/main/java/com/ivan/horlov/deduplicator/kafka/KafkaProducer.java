package com.ivan.horlov.deduplicator.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaProducer {

    private final KafkaTemplate<Boolean, String> kafkaTemplate;

    public void send(String url, boolean isDuplicate){
        kafkaTemplate.send("isn't_duplicate", url);
    }

}
