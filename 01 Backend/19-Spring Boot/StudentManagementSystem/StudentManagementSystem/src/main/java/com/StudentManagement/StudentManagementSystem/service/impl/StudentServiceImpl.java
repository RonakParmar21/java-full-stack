package com.StudentManagement.StudentManagementSystem.service.impl;

import com.StudentManagement.StudentManagementSystem.dto.StudentDto;
import com.StudentManagement.StudentManagementSystem.entity.Student;
import com.StudentManagement.StudentManagementSystem.repository.StudentRepository;
import com.StudentManagement.StudentManagementSystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        return students
                .stream()
                .map(student -> new StudentDto(student.getId(), student.getName(), student.getEmail()))
                .toList();
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with ID " + id));
        return modelMapper.map(student, StudentDto.class);
    }
}
