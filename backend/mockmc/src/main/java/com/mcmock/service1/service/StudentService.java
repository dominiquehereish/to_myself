package com.mcmock.service1.service;

import com.mcmock.service1.model.response.Response;
import org.springframework.http.ResponseEntity;

public interface StudentService {

    public ResponseEntity<Response> getAllStudents();
}
