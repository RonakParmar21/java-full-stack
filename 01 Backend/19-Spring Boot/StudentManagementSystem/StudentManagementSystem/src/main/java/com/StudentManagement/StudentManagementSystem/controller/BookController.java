package com.StudentManagement.StudentManagementSystem.controller;

import com.StudentManagement.StudentManagementSystem.dto.AddBookDto;
import com.StudentManagement.StudentManagementSystem.dto.BookDto;
import com.StudentManagement.StudentManagementSystem.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class BookController {
    private BookService bookService;

    @GetMapping("/books")
    public List<BookDto> getAllBook() {
        return bookService.getAllBook();
    }

    @GetMapping("/books/{id}")
    public BookDto getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public ResponseEntity<BookDto> saveBook(@RequestBody AddBookDto addBookDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.addBook(addBookDto));
    }
}
