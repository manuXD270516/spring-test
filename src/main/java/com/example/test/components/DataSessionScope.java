package com.example.test.components;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.example.test.models.Enrollment;
import com.example.test.models.Student;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DataSessionScope {

    private String name = "Session Scope";
    private LinkedList<Enrollment> enrollments = new LinkedList<>(Arrays.asList(
            new Enrollment().setEnrollmentId(2121).setName("Matricula Alumno 1"),
            new Enrollment().setEnrollmentId(9219).setName("Matricula Alumno 2")));
    private LinkedList<Student> students = new LinkedList<>(Arrays.asList(
            new Student().setStudentId(1).setStudentName("Miguel").setStudentAge(19),
            new Student().setStudentId(2).setStudentName("Juan").setStudentAge(12)));

    public DataSessionScope() {
        System.out.println("DataSessionScope Constructor Called at " + LocalDateTime.now());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void removeLastStudent() {
        System.out.println("CALLED REMOVE METHOD...");
        this.students.removeFirst();
        System.out.println("Count: " + this.students.size());
    }

    public List<Student> findMockStudents() {
        System.out.println("CALLED LIST METHOD...");
        return this.students;
    }

    public void addEnrollment() {
        System.out.println(this.enrollments.size());
        Enrollment s = new Enrollment().setEnrollmentId(23141).setName("Matricula alumno 3").setStudent(null);
        this.enrollments.add(s);
    }

    public List<Enrollment> findEnrollments() {
        return this.enrollments;
    }
}
