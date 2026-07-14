package com.StudentManagement.StudentManagementSystem.dto;

public class HostelStudentDto {
    private Long id;
    private String studentName;
    private String studentEmail;

    public HostelStudentDto() {
    }

    public HostelStudentDto(Long id, String studentName, String studentEmail) {
        this.id = id;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
