package com.example.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.models.Enrollment;
import com.example.test.services.IEnrollmentService;

@RestController
public class EnrollmentController {

    @Autowired
    private IEnrollmentService enrollmentService;

    @RequestMapping("/enrollments/find")
    public List<Enrollment> findAllEnrollments() {
        return enrollmentService.getDataSessionScope().findEnrollments();
    }

    @RequestMapping("/enrollments/add")
    public String addEnrollment() {
        enrollmentService.getDataSessionScope().addEnrollment();
        return "Matricula agregada correctamente";
    }

}
