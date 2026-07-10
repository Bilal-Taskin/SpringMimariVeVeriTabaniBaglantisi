package com.example.demo.controller.impl;

import com.example.demo.controller.IStudentController;
import com.example.demo.dto.StudentDTO;
import com.example.demo.dto.StudentIUDTO;
import com.example.demo.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;

    @Override
    @PostMapping("/save")
    public StudentDTO saveStudent(@RequestBody StudentIUDTO studentIUDTO) {
        return studentService.saveStudent(studentIUDTO);
    }

    @Override
    @GetMapping("/list")
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @Override
    @GetMapping("/get/{id}")
    public StudentDTO getStudentById(@PathVariable(name = "id") Long id) {
        return studentService.getStudentById(id);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable(name = "id") Long id) {
        studentService.deleteStudent(id);
    }
}