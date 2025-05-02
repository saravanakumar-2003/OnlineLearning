package com.example.OnlineLearning.Controller;

import com.example.OnlineLearning.DTO.*;
import com.example.OnlineLearning.Repository.ModuleRepository;
import com.example.OnlineLearning.Repository.QuizCompletedRepository;
import com.example.OnlineLearning.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @Autowired
    QuizCompletedRepository quizCompletedRepository;

    @Autowired
    ModuleRepository moduleRepository;

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

    @PutMapping("attendQuiz")
    public void attendQuiz(@RequestBody AttendQuizDTO attendQuizDTO){
        courseService.attendQuiz(attendQuizDTO);
    }

    @PutMapping("attendAssignment")
    public void attendAssignment(@RequestBody AttendAssignmentDTO attendAssignmentDTO){
        courseService.attendAssignment(attendAssignmentDTO);
    }

}
