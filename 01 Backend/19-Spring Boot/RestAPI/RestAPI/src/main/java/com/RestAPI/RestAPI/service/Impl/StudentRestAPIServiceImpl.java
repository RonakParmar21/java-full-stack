package com.RestAPI.RestAPI.service.Impl;

import com.RestAPI.RestAPI.dto.StudentRestAPIDto;
import com.RestAPI.RestAPI.entity.StudentRestAPI;
import com.RestAPI.RestAPI.repository.StudentRestAPIRepo;
import com.RestAPI.RestAPI.service.StudentRestAPIService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentRestAPIServiceImpl implements StudentRestAPIService {
    private final StudentRestAPIRepo studentRestAPIRepo;

    public StudentRestAPIServiceImpl(StudentRestAPIRepo studentRestAPIRepo) {
        this.studentRestAPIRepo = studentRestAPIRepo;
    }

    @Override
    public List<StudentRestAPIDto> getAllStudent() {
        List<StudentRestAPI> studentRestAPIList = studentRestAPIRepo.findAll();
        return studentRestAPIList.stream().
                map(studentRestAPI -> new StudentRestAPIDto(
                        studentRestAPI.getId(),
                        studentRestAPI.getName(),
                        studentRestAPI.getEmail())
        ).toList();
    }
}
