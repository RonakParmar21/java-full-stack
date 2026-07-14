package com.StudentManagement.StudentManagementSystem.service;

import com.StudentManagement.StudentManagementSystem.dto.BookDto;
import org.aspectj.weaver.ast.Literal;

import java.util.List;

public interface BookService {
    List<BookDto> getAllBook();
    BookDto getBookById(Long id);
}
