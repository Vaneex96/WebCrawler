package com.ivan.horlov.htmlparser.service.impl;

import com.ivan.horlov.htmlparser.kafka.KafkaProducer;
import com.ivan.horlov.htmlparser.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {

    private final KafkaProducer kafkaProducer;

    @Override
    public void parseHtmlByUrl(String url) {

    }
}
