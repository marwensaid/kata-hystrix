package com.example.howtodoinjava.springhystrixschoolservice.controller;

import com.example.howtodoinjava.springhystrixschoolservice.delegate.StudentServiceDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolServiceController {

    @Autowired
    StudentServiceDelegate studentServiceDelegate;

    // TODO REST : expose school + call student service to det data
    public String getStudents(@PathVariable String schoolname) {
        return null;
    }

}
