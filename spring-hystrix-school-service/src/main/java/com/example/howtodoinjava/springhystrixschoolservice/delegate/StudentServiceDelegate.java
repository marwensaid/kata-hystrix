package com.example.howtodoinjava.springhystrixschoolservice.delegate;

import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

public class StudentServiceDelegate {

	RestTemplate restTemplate;
	
	public String callStudentServiceAndGetData(String schoolname) {
		System.out.println("Getting School details for " + schoolname);
		String response = restTemplate
				.exchange("http://localhost:8098/getStudentDetailsForSchool/{schoolname}"
				, HttpMethod.GET
				, null
				, new ParameterizedTypeReference<String>() {
			}, schoolname).getBody();

		System.out.println("Response Received as " + response + " -  " + new Date());

		return "";
	}
	
	@SuppressWarnings("unused")
	private String callStudentServiceAndGetData_Fallback(String schoolname) {
		System.out.println("Student Service is down!!! fallback route enabled...");
		return "";
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
