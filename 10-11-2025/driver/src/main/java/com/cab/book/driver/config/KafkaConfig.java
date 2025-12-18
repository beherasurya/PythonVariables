package com.cab.book.driver.config;

import com.cab.book.driver.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topicLocation(){
        return TopicBuilder
                .name(AppConstant.DRIVER_MESSAGE)
                .build();
    }
}
