package com.example.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.models.Student;
import com.example.test.services.IStudentService;

@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/students/find")
    public List<Student> findAllStudents() {
        return studentService.getDataSessionScope().findMockStudents();
    }

    @RequestMapping("/students/remove")
    public String removeLastStudent() {
        studentService.getDataSessionScope().removeLastStudent();
        return "Estudiante eliminado correctamente";
    }

}
