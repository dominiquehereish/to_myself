package com.mcmock.service1.service;

import com.mcmock.service1.model.response.Response;
import org.springframework.http.ResponseEntity;

public interface EnvService {
    public ResponseEntity<Response> getEnvVars();
}
