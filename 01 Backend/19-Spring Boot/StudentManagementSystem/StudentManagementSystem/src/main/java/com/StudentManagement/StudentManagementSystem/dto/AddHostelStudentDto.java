package com.StudentManagement.StudentManagementSystem.dto;

public class AddHostelStudentDto {
    private String studentName;
    private String studentEmail;

    public AddHostelStudentDto() {
    }

    public AddHostelStudentDto(String studentName, String studentEmail) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
}
