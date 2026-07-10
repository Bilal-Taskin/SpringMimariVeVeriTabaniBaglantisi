package com.example.demo.services.impl;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // --- YENİ METOTLAR ---

    @Override
    public List<Student> getAllStudents() {
        // .findAll(): Veri tabanındaki "student" tablosundaki tüm satırları çeker (SELECT * FROM student)
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        // .findById(): Veri tabanında o ID'ye sahip bir veri var mı diye bakar (SELECT * FROM student WHERE id = ?)
        Optional<Student> optional = studentRepository.findById(id);
        
        // Eğer aranan ID'de öğrenci varsa onu döner, yoksa null döner (Hata yönetimini basitleştirmek için şimdilik böyle yapıyoruz)
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        // .deleteById(): Parametre olarak verilen ID'ye sahip satırı veri tabanından siler (DELETE FROM student WHERE id = ?)
        studentRepository.deleteById(id);
    }
}