package com.example.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.example.demo.constant.AppConstant.CAB_LOCATION;

@Configuration
public class KafkaConfig {


    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(CAB_LOCATION)
                .build();
    }
}
