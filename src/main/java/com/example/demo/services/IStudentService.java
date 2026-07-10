package com.example.demo.services;

import com.example.demo.dto.StudentDTO;
import com.example.demo.dto.StudentIUDTO;
import java.util.List;

public interface IStudentService {
    
    // Artık parametre olarak StudentIUDTO alıyor, geriye şeffaf StudentDTO dönüyor
    StudentDTO saveStudent(StudentIUDTO studentIUDTO);
    
    // Listeleme yaparken dış dünyaya StudentDTO listesi dönüyoruz
    List<StudentDTO> getAllStudents();
    
    StudentDTO getStudentById(Long id);
    
    void deleteStudent(Long id);
}