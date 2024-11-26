package com.ivan.horlov.urlextractor.service.impl;

import com.ivan.horlov.urlextractor.kafka.KafkaProducer;
import com.ivan.horlov.urlextractor.service.MainService;
import lombok.RequiredArgsConstructor;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MainServiceImpl implements MainService {

    private final KafkaProducer kafkaProducer;

    @Override
    public void processExtractor(Document document) {
        System.out.println("Saving document in DB");
        saveDocumentWithElasticSearch(document);

        System.out.println("Extracting...");
        String[] urls = extractUrlsFromDocument(document);

        System.out.println("Send urls to HtmlParser...");
        sendUrlsToHtmlParser(urls);
    }

    private String[] extractUrlsFromDocument(Document document) {
        return new String[]{"https://www.youtube.com/shorts"};
    }

    private void saveDocumentWithElasticSearch(Document document) {
        //TODO Implement saving
    }

    private void sendUrlsToHtmlParser(String[] urls){
        for(String url: urls){
            kafkaProducer.sendUrlToParse(url);
        }
    }
}
