package com.example.test.services;

import java.util.List;

import com.example.test.components.DataSessionScope;
import com.example.test.models.Enrollment;

public interface IEnrollmentService {

    void addEnrollment();

    List<Enrollment> findEnrollments();

    DataSessionScope getDataSessionScope();

}
