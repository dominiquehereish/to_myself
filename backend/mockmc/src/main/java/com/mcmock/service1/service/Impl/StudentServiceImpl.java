package com.mcmock.service1.service.Impl;

import com.mcmock.service1.model.Student;
import com.mcmock.service1.model.response.Response;
import com.mcmock.service1.model.response.StudentResponse;
import com.mcmock.service1.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public ResponseEntity<Response> getAllStudents() {
        Student student1 = new Student("Dominique", "Hereish", 38);
        Student student2 = new Student("John", "Doe", 40);
        StudentResponse response = new StudentResponse();
        response.addStudent(student1);
        response.addStudent(student2);
        return ResponseEntity.ok().body(response);
    }
}
