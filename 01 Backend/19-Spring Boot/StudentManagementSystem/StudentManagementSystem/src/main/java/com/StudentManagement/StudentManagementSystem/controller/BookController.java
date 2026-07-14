package com.StudentManagement.StudentManagementSystem.controller;

import com.StudentManagement.StudentManagementSystem.dto.BookDto;
import com.StudentManagement.StudentManagementSystem.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
