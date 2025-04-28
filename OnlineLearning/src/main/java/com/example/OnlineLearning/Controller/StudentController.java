package com.example.OnlineLearning.Controller;

import com.example.OnlineLearning.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public void addStudent(@RequestParam String student){

        studentService.addStudent(student);

    }
}
