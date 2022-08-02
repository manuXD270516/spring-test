package com.example.test.services;

import java.util.List;

import com.example.test.components.DataSessionScope;
import com.example.test.models.Student;

public interface IStudentService {

    void removeLastStudent();

    List<Student> findStudents();

    DataSessionScope getDataSessionScope();
}
