package com.example.OnlineLearning.DTO;

public class ModuleDTO {
    private String courseName;
    private String moduleName;
    private String assignment;

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

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public ModuleDTO() {
    }

    public ModuleDTO(String courseName, String moduleName, String assignment) {
        this.courseName = courseName;
        this.moduleName = moduleName;
        this.assignment = assignment;
    }
}
