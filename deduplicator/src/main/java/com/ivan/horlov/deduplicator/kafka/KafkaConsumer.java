package com.ivan.horlov.deduplicator.kafka;

import com.ivan.horlov.deduplicator.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaConsumer {

    private final MainService mainService;

    @KafkaListener(topics = "check_duplicate")
    public void listen(String url){
        mainService.checkDuplicate(url);
    }

}
