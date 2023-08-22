package com.mcmock.service1.controller;

import com.mcmock.service1.model.response.Response;
import com.mcmock.service1.service.EnvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/env")
public class VariablesController {

    @Autowired
    EnvService envService;

    @GetMapping()
    public ResponseEntity<Response> getStudents(){
        return envService.getEnvVars();
    }
}
