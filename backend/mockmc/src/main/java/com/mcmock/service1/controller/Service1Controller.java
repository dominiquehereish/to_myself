package com.mcmock.service1.controller;

import com.mcmock.service1.model.response.Response;
import com.mcmock.service1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class Service1Controller {

    @Autowired
    StudentService studentService;

    @GetMapping()
    public ResponseEntity<Response> getStudents(){
        return studentService.getAllStudents();
    }
}
