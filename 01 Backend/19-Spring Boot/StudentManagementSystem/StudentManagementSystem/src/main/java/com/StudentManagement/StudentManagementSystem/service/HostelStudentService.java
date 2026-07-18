package com.StudentManagement.StudentManagementSystem.service;

import com.StudentManagement.StudentManagementSystem.dto.AddHostelStudentDto;
import com.StudentManagement.StudentManagementSystem.dto.AddStudentRequestDto;
import com.StudentManagement.StudentManagementSystem.dto.HostelStudentDto;
import java.util.List;

public interface HostelStudentService {
    List<HostelStudentDto> getAllHostelStudent();
    HostelStudentDto createNewHostelStudent(AddHostelStudentDto addHostelStudentDto);
}
