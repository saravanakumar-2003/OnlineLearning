package com.example.OnlineLearning.Entity;

import jakarta.persistence.*;

@Entity
public class CourseEnrollEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "studId" , referencedColumnName = "studId")
    private StudentEntity studentEntity;

    @ManyToOne
    @JoinColumn(name = "courseId" , referencedColumnName = "courseId")
    private CourseEntity courseEntity;

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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public CourseEnrollEntity() {
    }

    public CourseEnrollEntity(int id, StudentEntity studentEntity, CourseEntity courseEntity, boolean status) {
        this.id = id;
        this.studentEntity = studentEntity;
        this.courseEntity = courseEntity;
        this.status = status;
    }
}
