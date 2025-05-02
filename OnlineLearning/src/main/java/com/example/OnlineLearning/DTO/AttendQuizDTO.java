package com.example.OnlineLearning.DTO;

public class AttendQuizDTO {

    private String studName;
    private String courseName;
    private String moduleName;
    private int quizId;

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

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public AttendQuizDTO() {
    }

    public AttendQuizDTO(String studName, String courseName, String moduleName, int quizId) {
        this.studName = studName;
        this.courseName = courseName;
        this.moduleName = moduleName;
        this.quizId = quizId;
    }
}