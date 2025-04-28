package com.example.OnlineLearning.Entity;

import jakarta.persistence.*;

@Entity
public class QuizEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quizId;

    @ManyToOne
    @JoinColumn(name = "moduleId" , referencedColumnName = "moduleId")
    private ModuleEntity moduleEntity;

    @Column
    private String question;

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public ModuleEntity getModuleEntity() {
        return moduleEntity;
    }

    public void setModuleEntity(ModuleEntity moduleEntity) {
        this.moduleEntity = moduleEntity;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public QuizEntity() {
    }

    public QuizEntity(int quizId, ModuleEntity moduleEntity, String question) {
        this.quizId = quizId;
        this.moduleEntity = moduleEntity;
        this.question = question;
    }
}
