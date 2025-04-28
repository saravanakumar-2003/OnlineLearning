package com.example.OnlineLearning.DTO;

public class CourseEnrollDTO {
    private String studName;
    private String courseName;

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public CourseEnrollDTO() {
    }

    public CourseEnrollDTO(String studName, String courseName) {
        this.studName = studName;
        this.courseName = courseName;
    }
}
