package com.example.howtodoinjava.springhystrixstudentservice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.howtodoinjava.springhystrixstudentservice.domain.Student;

@RestController
public class StudentServiceController {

	private static Map<String, List<Student>> schoolDB;

	static {
		schoolDB = new HashMap<String, List<Student>>();

		List<Student> lst = new ArrayList<Student>();

		// 2- create and add 2 student to firstSchool

		// 3- create and add 2 student to secondSchool

	}

	// 4- expose student details for school : REST
	public List<Student> getStudents(@PathVariable String schoolname) {
		System.out.println("Getting Student details for " + schoolname);

		List<Student> studentList = schoolDB.get(schoolname);
		return studentList;
	}
}
