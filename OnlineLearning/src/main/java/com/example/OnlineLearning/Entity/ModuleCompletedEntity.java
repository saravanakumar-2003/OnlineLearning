package com.example.OnlineLearning.Entity;

import jakarta.persistence.*;

@Entity
public class ModuleCompletedEntity {

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
    @JoinColumn(name = "moduleId", referencedColumnName = "moduleId")
    private ModuleEntity moduleEntity;

    @Column
    private boolean assignmentStatus;

    @Column
    private boolean quizStatus;

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

    public boolean isAssignmentStatus() {
        return assignmentStatus;
    }

    public void setAssignmentStatus(boolean assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    public boolean isQuizStatus() {
        return quizStatus;
    }

    public void setQuizStatus(boolean quizStatus) {
        this.quizStatus = quizStatus;
    }

    public ModuleCompletedEntity() {
    }

    public ModuleCompletedEntity(int id, StudentEntity studentEntity, CourseEntity courseEntity, ModuleEntity moduleEntity, boolean assignmentStatus, boolean quizStatus) {
        this.id = id;
        this.studentEntity = studentEntity;
        this.courseEntity = courseEntity;
        this.moduleEntity = moduleEntity;
        this.assignmentStatus = assignmentStatus;
        this.quizStatus = quizStatus;
    }
}
