package com.example.test.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.components.DataSessionScope;
import com.example.test.models.Student;
import com.example.test.services.IStudentService;

@Service
public class StudentService implements IStudentService {

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
    public void removeLastStudent() {
        dataSessionScope.removeLastStudent();

    }

    @Override
    public List<Student> findStudents() {
        return dataSessionScope.findMockStudents();
    }

}
