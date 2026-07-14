package com.StudentManagement.StudentManagementSystem.repository;

import com.StudentManagement.StudentManagementSystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
