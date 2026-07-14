package com.StudentManagement.StudentManagementSystem.service.impl;

import com.StudentManagement.StudentManagementSystem.dto.BookDto;
import com.StudentManagement.StudentManagementSystem.entity.Book;
import com.StudentManagement.StudentManagementSystem.repository.BookRepository;
import com.StudentManagement.StudentManagementSystem.service.BookService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<BookDto> getAllBook() {
        List<Book> books = bookRepository.findAll();
        return books.stream().map(book -> new BookDto(book.getId(), book.getBookName(), book.getBookAuthor())).toList();
    }

    @Override
    public BookDto getBookById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Book not found with id : " + id));
        return modelMapper.map(book, BookDto.class);
    }


}
