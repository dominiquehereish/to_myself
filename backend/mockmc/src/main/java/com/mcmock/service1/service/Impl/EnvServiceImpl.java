package com.mcmock.service1.service.Impl;

import com.mcmock.service1.model.response.EnvVarResponse;
import com.mcmock.service1.model.response.Response;
import com.mcmock.service1.service.EnvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EnvServiceImpl implements EnvService {

    @Autowired
    Environment environment;
    @Override
    public ResponseEntity<Response> getEnvVars() {
        EnvVarResponse response = new EnvVarResponse();
        response.addEnvVar(environment.getProperty("dom.variable1"));
        response.addEnvVar(environment.getProperty("dom.variable2"));
        response.addEnvVar(environment.getProperty("dom.secret1"));
        return ResponseEntity.ok().body(response);
    }
}
