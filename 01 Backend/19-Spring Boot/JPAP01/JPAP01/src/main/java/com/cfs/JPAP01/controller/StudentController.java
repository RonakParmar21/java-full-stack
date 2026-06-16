package com.cfs.JPAP01.controller;

import com.cfs.JPAP01.entity.Student;
import com.cfs.JPAP01.repo.StudentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

//    @Autowired
//    private StudentRepo studentRepo;

    private final StudentRepo studentRepo;

    // if I have only one variable then no need to add @Autowired it will automatically consider as Autowired.
    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @GetMapping
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

//    @PutMapping("/{id}")
    @PutMapping
    public Student updateStudent(@RequestParam Long id, @RequestBody Student student) {
        Student s = studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        // put validation here in production level
        s.setName(student.getName());
        s.setEmail(student.getEmail());

        return studentRepo.save(s);
    }

    @PatchMapping
    public Student patchStudent(@RequestParam Long id, @RequestParam String name) {
        Student s = studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        // put validation here in production level
//        s.setName(student.getName());
//        s.setEmail(student.getEmail());
        s.setName(name);
        return studentRepo.save(s);
    }
}
