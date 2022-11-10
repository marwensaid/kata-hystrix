package com.example.howtodoinjava.springhystrixschoolservice.delegate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

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
