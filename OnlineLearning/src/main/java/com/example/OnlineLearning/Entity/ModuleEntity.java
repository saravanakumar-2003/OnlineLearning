package com.example.OnlineLearning.Entity;

import jakarta.persistence.*;

@Entity
public class ModuleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int moduleId;

    @ManyToOne
    @JoinColumn(name = "courseId", referencedColumnName = "courseId")
    private CourseEntity courseEntity;

    @Column
    private String moduleName;

    @Column
    private String assignment;

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public CourseEntity getCourseEntity() {
        return courseEntity;
    }

    public void setCourseEntity(CourseEntity courseEntity) {
        this.courseEntity = courseEntity;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public ModuleEntity() {
    }

    public ModuleEntity(int moduleId, CourseEntity courseEntity, String moduleName, String assignment) {
        this.moduleId = moduleId;
        this.courseEntity = courseEntity;
        this.moduleName = moduleName;
        this.assignment = assignment;
    }
}
