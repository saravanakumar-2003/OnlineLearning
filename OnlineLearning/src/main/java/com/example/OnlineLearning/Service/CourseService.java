package com.example.OnlineLearning.Service;

import com.example.OnlineLearning.DTO.*;
import com.example.OnlineLearning.Entity.*;
import com.example.OnlineLearning.Repository.*;
import jakarta.transaction.Transactional;
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

    @Autowired
    ModuleCompletedRepository moduleCompletedRepository;

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
            System.out.println("/n/n/n/n/n/n/n/n/n");

            for(QuizEntity j : qe){
                QuizCompletedEntity quizCompletedEntity = new QuizCompletedEntity();
                quizCompletedEntity.setStudentEntity(studentRepository.findByStudName(courseEnrollDTO.getStudName()));
                quizCompletedEntity.setCourseEntity((courseRepository.findByCourseName(courseEnrollDTO.getCourseName())));
                quizCompletedEntity.setModuleEntity(moduleRepository.findByModuleName(i.getModuleName()));
                quizCompletedEntity.setStatus(false);
                System.out.println(j.getQuizId());
                quizCompletedEntity.setQuizEntity(j);
                quizCompletedRepository.save(quizCompletedEntity);
            }

            ModuleCompletedEntity moduleCompletedEntity = new ModuleCompletedEntity();
            moduleCompletedEntity.setStudentEntity(studentRepository.findByStudName(courseEnrollDTO.getStudName()));
            moduleCompletedEntity.setCourseEntity(courseRepository.findByCourseName(courseEnrollDTO.getCourseName()));
            moduleCompletedEntity.setModuleEntity(i);
            moduleCompletedEntity.setQuizStatus(false);
            moduleCompletedEntity.setAssignmentStatus(false);
            moduleCompletedRepository.save(moduleCompletedEntity);
        }
    }

    @Transactional
    public void attendQuiz(AttendQuizDTO attendQuizDTO) {

        StudentEntity studentEntity = studentRepository.findByStudName(attendQuizDTO.getStudName());
        CourseEntity courseEntity = courseRepository.findByCourseName(attendQuizDTO.getCourseName());
        ModuleEntity moduleEntity = moduleRepository.findByModuleName(attendQuizDTO.getModuleName());
        QuizEntity quizEntity = quizRepository.findByQuizId(attendQuizDTO.getQuizId());
        quizCompletedRepository.attendQuiz(studentEntity,courseEntity,moduleEntity,quizEntity);


        if(quizCompletedRepository.isCompleted(moduleEntity)){
            moduleCompletedRepository.moduleCompleted(moduleEntity);
        }

    }

    @Transactional
    public void attendAssignment(AttendAssignmentDTO attendAssignmentDTO) {

        StudentEntity studentEntity = studentRepository.findByStudName(attendAssignmentDTO.getStudName());
        CourseEntity courseEntity = courseRepository.findByCourseName((attendAssignmentDTO.getCourseName()));
        ModuleEntity moduleEntity = moduleRepository.findByModuleName(attendAssignmentDTO.getModuleName());
        moduleCompletedRepository.attendAssignment(studentEntity,courseEntity,moduleEntity);
    }
}
