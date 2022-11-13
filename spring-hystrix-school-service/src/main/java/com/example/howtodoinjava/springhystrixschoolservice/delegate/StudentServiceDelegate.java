package com.example.howtodoinjava.springhystrixschoolservice.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentServiceDelegate {

    @Autowired
    RestTemplate restTemplate;

    // TODO call our student service with details : make sure to do http exchange method : call fallback method if my service is down


    // TODO make a hystrix fallback method

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
