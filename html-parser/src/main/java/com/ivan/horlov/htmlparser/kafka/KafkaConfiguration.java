package com.ivan.horlov.htmlparser.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic urlTopic(){
        return new NewTopic("urls", 5, (short) 1);
    }

    @Bean
    public NewTopic htmlDocumentTopic(){
        return new NewTopic("html_document", 5, (short) 1);
    }

    @Bean
    public NewTopic checkDuplicateTopic(){
        return new NewTopic("check_duplicate", 5, (short) 1);
    }

    @Bean
    public NewTopic isNotDuplicateTopic(){
        return new NewTopic("isn't_duplicate", 5, (short) 1);
    }

}
