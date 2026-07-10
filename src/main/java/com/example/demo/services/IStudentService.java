package com.example.demo.services;

import com.example.demo.entities.Student;
import java.util.List; // Listeleme işlemi için Java'nın List yapısını import ediyoruz.

public interface IStudentService {
    
    // Veri tabanına yeni bir öğrenci kaydetmek için (Zaten yazmıştık)
    Student saveStudent(Student student);

    // Veri tabanındaki TÜM öğrencileri listelemek için kullanılacak metot
    List<Student> getAllStudents();

    // Veri tabanından BELİRLİ BİR ID'ye sahip öğrenciyi getirmek için kullanılacak metot
    Student getStudentById(Long id);

    // Veri tabanından BELİRLİ BİR ID'ye sahip öğrenciyi silmek için kullanılacak metot
    void deleteStudent(Long id);
}