package com.StudentManagement.StudentManagementSystem.service;

import com.StudentManagement.StudentManagementSystem.dto.AddStudentRequestDto;
import com.StudentManagement.StudentManagementSystem.dto.StudentDto;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);

    @Nullable StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);

    @Nullable StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
}
