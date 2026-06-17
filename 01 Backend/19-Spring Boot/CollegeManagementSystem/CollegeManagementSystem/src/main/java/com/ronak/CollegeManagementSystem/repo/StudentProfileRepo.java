package com.ronak.CollegeManagementSystem.repo;

import com.ronak.CollegeManagementSystem.entity.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentProfileRepo extends JpaRepository<StudentProfile, Long> {
}
