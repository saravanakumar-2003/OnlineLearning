package com.example.OnlineLearning.Entity;

import jakarta.persistence.*;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studId;

    @Column
    private String studName;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public StudentEntity() {
    }

    public StudentEntity(int studId, String studName) {
        this.studId = studId;
        this.studName = studName;
    }
}
