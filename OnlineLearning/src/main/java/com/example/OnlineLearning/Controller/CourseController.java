package com.example.OnlineLearning.Controller;

import com.example.OnlineLearning.DTO.CourseEnrollDTO;
import com.example.OnlineLearning.DTO.ModuleDTO;
import com.example.OnlineLearning.DTO.QuizDTO;
import com.example.OnlineLearning.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("/addCourse")
    public void addCourse(@RequestParam String course){

        courseService.addCourse(course);
    }

    @PostMapping("/addModule")
    public void addModule(@RequestBody ModuleDTO moduleDTO){
        courseService.addModule(moduleDTO);
    }

    @PostMapping("/addQuiz")
    public void addQuiz(@RequestBody QuizDTO quizDTO){
        courseService.addQuiz(quizDTO);
    }

    @PostMapping("/enrollCourse")
    public void enrollCourse(@RequestBody CourseEnrollDTO courseEnrollDTO){
        courseService.enrollCourse(courseEnrollDTO);
    }
}
