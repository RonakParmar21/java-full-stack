package com.StudentManagement.StudentManagementSystem.service;

import com.StudentManagement.StudentManagementSystem.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);
}
