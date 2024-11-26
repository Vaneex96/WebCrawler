package com.ivan.horlov.deduplicator.service.impl;

import com.ivan.horlov.deduplicator.kafka.KafkaProducer;
import com.ivan.horlov.deduplicator.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MainServiceImpl implements MainService {

    private final KafkaProducer kafkaProducer;

    @Override
    public void checkDuplicate(String url) {
        System.out.println("This url is duplicate");
        kafkaProducer.send(url, true);
    }
}
