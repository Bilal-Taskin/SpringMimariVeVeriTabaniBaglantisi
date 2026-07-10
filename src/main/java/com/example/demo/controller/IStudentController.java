package com.example.demo.controller;

import com.example.demo.dto.StudentDTO;
import com.example.demo.dto.StudentIUDTO;
import java.util.List;

public interface IStudentController {

    StudentDTO saveStudent(StudentIUDTO studentIUDTO);

    List<StudentDTO> getAllStudents();

    StudentDTO getStudentById(Long id);

    void deleteStudent(Long id);
}