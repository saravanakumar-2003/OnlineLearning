package com.example.OnlineLearning.DTO;

public class AttendAssignmentDTO {

    private String studName;
    private String courseName;
    private String moduleName;

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

    public AttendAssignmentDTO() {
    }

    public AttendAssignmentDTO(String studName, String courseName, String moduleName) {
        this.studName = studName;
        this.courseName = courseName;
        this.moduleName = moduleName;
    }
}
