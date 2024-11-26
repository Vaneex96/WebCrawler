package com.ivan.horlov.urlextractor.kafka;

import com.ivan.horlov.urlextractor.service.MainService;
import lombok.RequiredArgsConstructor;
import org.jsoup.nodes.Document;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaConsumer {

    private final MainService mainService;

    @KafkaListener(topics = "html_document")
    public void listen(Document document){
        mainService.processExtractor(document);
    }

}
