package com.example.demo.services.impl;

import com.example.demo.dto.StudentDTO;
import com.example.demo.dto.StudentIUDTO;
import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentDTO saveStudent(StudentIUDTO studentIUDTO) {
        // --- MAPPING 1: DTO'dan Entity'ye Dönüşüm ---
        Student student = new Student();
        student.setName(studentIUDTO.getName());
        student.setSurname(studentIUDTO.getSurname());
        student.setBirthDate(studentIUDTO.getBirthDate()); // Doğum gününü aldık ve entity'ye setledik

        // Veri tabanına kaydetme işlemi (Entity ile çalışır)
        Student savedStudent = studentRepository.save(student);

        // --- MAPPING 2: Entity'den DTO'ye Dönüşüm (Geri Dönüş Çıktısı) ---
        StudentDTO responseDTO = new StudentDTO();
        responseDTO.setId(savedStudent.getId());
        responseDTO.setName(savedStudent.getName());
        responseDTO.setSurname(savedStudent.getSurname());
        // DİKKAT: birthDate alanını responseDTO'ya setlemiyoruz! Kullanıcı görmeyecek.

        return responseDTO;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        List<StudentDTO> dtoList = new ArrayList<>();

        // Tüm entity listesini tek tek DTO listesine dönüştürüyoruz
        for (Student student : studentList) {
            StudentDTO dto = new StudentDTO();
            dto.setId(student.getId());
            dto.setName(student.getName());
            dto.setSurname(student.getSurname());
            // Doğum günü yine eklenmiyor
            
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public StudentDTO getStudentById(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if(optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            
            StudentDTO dto = new StudentDTO();
            dto.setId(student.getId());
            dto.setName(student.getName());
            dto.setSurname(student.getSurname());
            
            return dto;
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}