package com.example.OnlineLearning.DTO;

public class QuizDTO {
    private String moduleName;
    private String question;

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public QuizDTO() {
    }

    public QuizDTO(String moduleName, String question) {
        this.moduleName = moduleName;
        this.question = question;
    }
}
