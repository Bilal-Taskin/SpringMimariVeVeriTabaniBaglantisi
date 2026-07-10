package com.example.demo.controller.impl;

import com.example.demo.controller.IStudentController;
import com.example.demo.entities.Student;
import com.example.demo.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping("/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    // --- YENİ ENDPOINT'LER ---

    // @GetMapping: Postman'den gelecek veri çekme (SELECT) isteklerini karşılar.
    // Adres: localhost:8080/rest/api/student/list
    @GetMapping("/list")
    @Override
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // @PathVariable: URL içerisindeki değişkeni (örneğin /get/1 adresindeki 1 rakamını) alıp Java'daki 'id' değişkenine atar.
    // Adres: localhost:8080/rest/api/student/get/1
    @GetMapping("/get/{id}")
    @Override
    public Student getStudentById(@PathVariable(name = "id") Long id) {
        return studentService.getStudentById(id);
    }

    // @DeleteMapping: Postman'den gelecek veri silme (DELETE) isteklerini karşılar.
    // Adres: localhost:8080/rest/api/student/delete/1
    @DeleteMapping("/delete/{id}")
    @Override
    public void deleteStudent(@PathVariable(name = "id") Long id) {
        studentService.deleteStudent(id);
    }
}