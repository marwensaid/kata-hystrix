package com.example.howtodoinjava.springhystrixschoolservice.controller;

import org.springframework.web.bind.annotation.PathVariable;

public class SchoolServiceController {

	// 1- REST : expose school + call student service to det data
	
	public String getStudents(@PathVariable String schoolname) {
		return "";
	}
	
}
