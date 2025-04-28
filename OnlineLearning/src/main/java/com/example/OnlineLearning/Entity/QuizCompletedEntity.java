package com.example.OnlineLearning.Entity;

import jakarta.persistence.*;

@Entity
public class QuizCompletedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "studId" , referencedColumnName = "studId")
    private StudentEntity studentEntity;

    @ManyToOne
    @JoinColumn(name = "courseId" , referencedColumnName = "courseId")
    private CourseEntity courseEntity;

    @ManyToOne
    @JoinColumn(name = "moduleId" , referencedColumnName = "moduleId")
    private ModuleEntity moduleEntity;

    @ManyToOne
    @JoinColumn(name = "quizId" , referencedColumnName = "quizId")
    private QuizEntity quizEntity;

    @Column
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public CourseEntity getCourseEntity() {
        return courseEntity;
    }

    public void setCourseEntity(CourseEntity courseEntity) {
        this.courseEntity = courseEntity;
    }

    public ModuleEntity getModuleEntity() {
        return moduleEntity;
    }

    public void setModuleEntity(ModuleEntity moduleEntity) {
        this.moduleEntity = moduleEntity;
    }

    public QuizEntity getQuizEntity() {
        return quizEntity;
    }

    public void setQuizEntity(QuizEntity quizEntity) {
        this.quizEntity = quizEntity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public QuizCompletedEntity() {
    }

    public QuizCompletedEntity(int id, StudentEntity studentEntity, CourseEntity courseEntity, ModuleEntity moduleEntity, QuizEntity quizEntity, boolean status) {
        this.id = id;
        this.studentEntity = studentEntity;
        this.courseEntity = courseEntity;
        this.moduleEntity = moduleEntity;
        this.quizEntity = quizEntity;
        this.status = status;
    }
}
