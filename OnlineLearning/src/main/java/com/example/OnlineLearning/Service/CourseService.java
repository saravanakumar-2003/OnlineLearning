package com.example.OnlineLearning.Service;

import com.example.OnlineLearning.DTO.CourseEnrollDTO;
import com.example.OnlineLearning.DTO.ModuleDTO;
import com.example.OnlineLearning.DTO.QuizDTO;
import com.example.OnlineLearning.Entity.*;
import com.example.OnlineLearning.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    ModuleRepository moduleRepository;

    @Autowired
    QuizRepository quizRepository;

    @Autowired
    CourseEnrollRepository courseEnrollRepository;

    @Autowired
    QuizCompletedRepository quizCompletedRepository;

    public void addCourse(String course) {
        CourseEntity courseEntity = new CourseEntity();

        courseEntity.setCourseName(course);
        courseRepository.save(courseEntity);
    }

    public void addModule(ModuleDTO moduleDTO) {

        ModuleEntity moduleEntity = new ModuleEntity();
        moduleEntity.setCourseEntity(courseRepository.findByCourseName(moduleDTO.getCourseName()));
        moduleEntity.setModuleName(moduleDTO.getModuleName());
        moduleEntity.setAssignment(moduleDTO.getAssignment());
        moduleRepository.save(moduleEntity);
    }

    public void addQuiz(QuizDTO quizDTO) {

        QuizEntity quizEntity = new QuizEntity();
        quizEntity.setModuleEntity(moduleRepository.findByModuleName(quizDTO.getModuleName()));
        quizEntity.setQuestion(quizDTO.getQuestion());
        quizRepository.save(quizEntity);
    }

    public void enrollCourse(CourseEnrollDTO courseEnrollDTO) {

        CourseEnrollEntity courseEnrollEntity = new CourseEnrollEntity();
        courseEnrollEntity.setStudentEntity(studentRepository.findByStudName(courseEnrollDTO.getStudName()));
        courseEnrollEntity.setCourseEntity((courseRepository.findByCourseName(courseEnrollDTO.getCourseName())));
        courseEnrollEntity.setStatus(false);
        courseEnrollRepository.save(courseEnrollEntity);

        CourseEntity ce = courseRepository.findByCourseName(courseEnrollDTO.getCourseName());

        List<ModuleEntity> me = moduleRepository.findAllByCourseEntity(ce);

        for(ModuleEntity i : me){

            List<QuizEntity> qe = quizRepository.findAllByModuleEntity(i);

            for(QuizEntity j : qe){

                QuizCompletedEntity quizCompletedEntity = new QuizCompletedEntity();
                quizCompletedEntity.setStudentEntity(studentRepository.findByStudName(courseEnrollDTO.getStudName()));
                quizCompletedEntity.setCourseEntity((courseRepository.findByCourseName(courseEnrollDTO.getCourseName())));
                quizCompletedEntity.setModuleEntity(moduleRepository.findByModuleName(i.getModuleName()));
                quizCompletedEntity.setQuizEntity((quizRepository.findByModuleEntity(i)));
                quizCompletedEntity.setStatus(false);
                quizCompletedRepository.save(quizCompletedEntity);

            }
        }
    }
}
