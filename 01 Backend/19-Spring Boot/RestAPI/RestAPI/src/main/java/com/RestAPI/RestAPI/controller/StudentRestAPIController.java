package com.RestAPI.RestAPI.controller;

import com.RestAPI.RestAPI.dto.StudentRestAPIDto;
import com.RestAPI.RestAPI.service.StudentRestAPIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentRestAPIController {
    private StudentRestAPIService studentRestAPIService;

    public StudentRestAPIController(StudentRestAPIService studentRestAPIService) {
        this.studentRestAPIService = studentRestAPIService;
    }

    @GetMapping("/getstudent")
    public List<StudentRestAPIDto> getAllStudents() {
        return studentRestAPIService.getAllStudent();
    }
}
