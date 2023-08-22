package com.mcmock.service1.model.response;

import com.mcmock.service1.model.Student;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StudentResponse extends Response{

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        this.students.add(student);
    }
}
