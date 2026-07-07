package com.BookStoreAPI.BookStoreAPI.controller;

import com.BookStoreAPI.BookStoreAPI.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {
    private Map<Long, Student> studentDB = new HashMap<>();
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(new ArrayList<>(studentDB.values()));
    }

    @PostMapping
    public ResponseEntity<Student> postStudent(@RequestBody Student student) {
        studentDB.put(student.getId(), student);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentDB.get(id);
        if(student == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        return ResponseEntity.ok().body(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        Student existingStudent = studentDB.get(id);
        if (existingStudent == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        studentDB.put(id, student);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(existingStudent);
    }

    @PatchMapping("/{id}/mobile")
    public ResponseEntity<Student> updateMobile(@PathVariable Long id, @RequestBody Double newMobile) {
        Student existingStudent = studentDB.get(id);
        if (existingStudent == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        existingStudent.setMobileNo(newMobile);
        studentDB.put(id, existingStudent);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(existingStudent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable Long id) {
        Student existingStudent = studentDB.remove(id);
        if(existingStudent == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        return ResponseEntity.ok().build();
    }
}
