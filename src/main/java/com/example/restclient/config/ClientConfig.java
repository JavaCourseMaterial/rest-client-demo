package com.example.restclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ClientConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        RestTemplate template = new RestTemplate();
        // set template configuration here
        return template;
    }
}
