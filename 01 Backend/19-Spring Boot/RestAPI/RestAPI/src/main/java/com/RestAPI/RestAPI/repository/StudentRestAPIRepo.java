package com.RestAPI.RestAPI.repository;

import com.RestAPI.RestAPI.entity.StudentRestAPI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRestAPIRepo extends JpaRepository<StudentRestAPI, Long> {
}
