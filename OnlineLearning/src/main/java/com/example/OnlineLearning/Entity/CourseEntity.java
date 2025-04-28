package com.example.OnlineLearning.Entity;

import jakarta.persistence.*;

@Entity
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    @Column
    private String courseName;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public CourseEntity() {
    }

    public CourseEntity(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
}
