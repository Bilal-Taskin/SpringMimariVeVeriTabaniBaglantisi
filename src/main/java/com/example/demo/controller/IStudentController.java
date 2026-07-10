package com.example.demo.controller;

import com.example.demo.entities.Student;
import java.util.List;

public interface IStudentController {

    Student saveStudent(Student student);

    // Tüm öğrencileri listelemek için kullanacağımız metot tanımı
    List<Student> getAllStudents();

    // ID'ye göre tek bir öğrenciyi getirmek için kullanacağımız metot tanımı
    Student getStudentById(Long id);

    // ID'ye göre öğrenciyi silmek için kullanacağımız metot tanımı
    void deleteStudent(Long id);
}