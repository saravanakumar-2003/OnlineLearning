package com.example.OnlineLearning.Service;

import com.example.OnlineLearning.Entity.StudentEntity;
import com.example.OnlineLearning.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(String student) {

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudName(student);
        studentRepository.save(studentEntity);
    }
}
