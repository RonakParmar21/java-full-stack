package com.StudentManagement.StudentManagementSystem.controller;

import com.StudentManagement.StudentManagementSystem.dto.AddHostelStudentDto;
import com.StudentManagement.StudentManagementSystem.dto.HostelStudentDto;
import com.StudentManagement.StudentManagementSystem.service.HostelStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HostelStudentController {
    private HostelStudentService hostelStudentService;

    public HostelStudentController(HostelStudentService hostelStudentService) {
        this.hostelStudentService = hostelStudentService;
    }

    @GetMapping("/hostelstudent")
    public List<HostelStudentDto> getAllHostelStudent() {
        System.out.println("Hostel Student Controller :- " + hostelStudentService.getAllHostelStudent());
        return hostelStudentService.getAllHostelStudent();
    }

    @PostMapping("/hostelstudent")
    public ResponseEntity<HostelStudentDto> saveStudent(@RequestBody AddHostelStudentDto addHostelStudentDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(hostelStudentService.createNewHostelStudent(addHostelStudentDto));
    }
}
