package com.ivan.horlov.htmlparser.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "urls")
    public void listen(String url){
        System.out.println(url);
    }

}
