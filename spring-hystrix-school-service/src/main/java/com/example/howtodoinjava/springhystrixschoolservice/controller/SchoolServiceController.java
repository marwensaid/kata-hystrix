package com.example.howtodoinjava.springhystrixschoolservice.controller;

import com.example.howtodoinjava.springhystrixschoolservice.delegate.StudentServiceDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolServiceController {

	@Autowired
    StudentServiceDelegate studentServiceDelegate;

    // 1- REST : expose school + call student service to det data
    @GetMapping(value = "/getSchoolDetails/{schoolname}")
    public String getStudents(@PathVariable String schoolname) {
        return studentServiceDelegate.callStudentServiceAndGetData(schoolname);
    }

}
