package com.ivan.horlov.htmlparser.kafka;

import lombok.RequiredArgsConstructor;
import org.jsoup.nodes.Document;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaProducer {

    private final KafkaTemplate<String, Document> kafkaTemplate;

    public void sendHtmlDocument(Document document){
        kafkaTemplate.send("html_document", document);
    }

}
