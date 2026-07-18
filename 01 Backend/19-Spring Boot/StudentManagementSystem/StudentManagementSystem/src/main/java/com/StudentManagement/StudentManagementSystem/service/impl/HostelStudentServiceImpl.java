package com.StudentManagement.StudentManagementSystem.service.impl;

import com.StudentManagement.StudentManagementSystem.dto.AddHostelStudentDto;
import com.StudentManagement.StudentManagementSystem.dto.AddStudentRequestDto;
import com.StudentManagement.StudentManagementSystem.dto.HostelStudentDto;
import com.StudentManagement.StudentManagementSystem.dto.StudentDto;
import com.StudentManagement.StudentManagementSystem.entity.HostelStudent;
import com.StudentManagement.StudentManagementSystem.repository.HostelStudentRepository;
import com.StudentManagement.StudentManagementSystem.service.HostelStudentService;
import org.apache.catalina.Host;
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

    @Override
    public HostelStudentDto createNewHostelStudent(AddHostelStudentDto addHostelStudentDto) {
        HostelStudent newHostelStudent = new HostelStudent();
        newHostelStudent.setStudentName(addHostelStudentDto.getStudentName());
        newHostelStudent.setStudentEmail(addHostelStudentDto.getStudentEmail());

        HostelStudent saveHostelStudent = hostelStudentRepository.save(newHostelStudent);

        HostelStudentDto hostelStudentDto = new HostelStudentDto();
        hostelStudentDto.setId(saveHostelStudent.getId());
        hostelStudentDto.setStudentName(saveHostelStudent.getStudentName());
        hostelStudentDto.setStudentEmail(saveHostelStudent.getStudentEmail());

        return hostelStudentDto;
    }
}
