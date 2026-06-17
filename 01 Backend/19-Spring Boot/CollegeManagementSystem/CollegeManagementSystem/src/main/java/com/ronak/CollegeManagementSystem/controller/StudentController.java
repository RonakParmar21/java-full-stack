package com.ronak.CollegeManagementSystem.controller;

import com.ronak.CollegeManagementSystem.entity.Student;
import com.ronak.CollegeManagementSystem.repo.StudentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @GetMapping
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }
}
