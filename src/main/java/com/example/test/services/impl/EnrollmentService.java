package com.example.test.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.components.DataSessionScope;
import com.example.test.models.Enrollment;
import com.example.test.services.IEnrollmentService;

@Service
public class EnrollmentService implements IEnrollmentService {

    @Autowired
    private DataSessionScope dataSessionScope;

    public void setDataSessionScope(DataSessionScope dataSessionScope) {
        this.dataSessionScope = dataSessionScope;
    }

    @Override
    public DataSessionScope getDataSessionScope() {
        return dataSessionScope;
    }

    @Override
    public void addEnrollment() {
        dataSessionScope.addEnrollment();
    }

    @Override
    public List<Enrollment> findEnrollments() {
        return dataSessionScope.findEnrollments();
    }
}
