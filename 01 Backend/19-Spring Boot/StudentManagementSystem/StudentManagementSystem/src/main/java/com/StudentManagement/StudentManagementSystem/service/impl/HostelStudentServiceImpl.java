package com.StudentManagement.StudentManagementSystem.service.impl;

import com.StudentManagement.StudentManagementSystem.dto.HostelStudentDto;
import com.StudentManagement.StudentManagementSystem.entity.HostelStudent;
import com.StudentManagement.StudentManagementSystem.repository.HostelStudentRepository;
import com.StudentManagement.StudentManagementSystem.service.HostelStudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostelStudentServiceImpl implements HostelStudentService {

    private final HostelStudentRepository hostelStudentRepository;

    public HostelStudentServiceImpl(HostelStudentRepository hostelStudentRepository) {
        this.hostelStudentRepository = hostelStudentRepository;
    }

    @Override
    public List<HostelStudentDto> getAllHostelStudent() {
        List<HostelStudent> hostelStudentList = hostelStudentRepository.findAll();
        System.out.println("Hostel student servcie impl :- " + hostelStudentList);
        return hostelStudentList.stream().map(hostelStudent -> new HostelStudentDto(hostelStudent.getId(), hostelStudent.getStudentName(), hostelStudent.getStudentEmail())).toList();
    }
}
