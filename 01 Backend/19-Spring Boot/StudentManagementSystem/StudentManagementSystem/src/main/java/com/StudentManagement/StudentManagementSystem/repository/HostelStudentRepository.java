package com.StudentManagement.StudentManagementSystem.repository;

import com.StudentManagement.StudentManagementSystem.entity.HostelStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostelStudentRepository extends JpaRepository<HostelStudent, Long> {
}
