package com.mcmock.service1.model.response;

import com.mcmock.service1.model.Student;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EnvVarResponse extends Response{

    private List<String> vars = new ArrayList<>();

    public void addEnvVar(String variable){
        this.vars.add(variable);
    }
}
