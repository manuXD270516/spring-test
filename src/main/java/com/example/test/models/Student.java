package com.example.test.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "student", uniqueConstraints = { @UniqueConstraint(columnNames = { "id" }) })
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11, nullable = false, unique = true)
    private Integer studentId;

    @Column(name = "name", length = 20, nullable = true)
    private String studentName;

    @Column(name = "age", length = 5, nullable = true)
    private Integer studentAge;

    @OneToOne(fetch = FetchType.LAZY)
    // @Column(name = "fk_order")
    private Enrollment enrollment;

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Student setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public Student setStudentId(Integer studentId) {
        this.studentId = studentId;
        return this;
    }

    public Student setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
        return this;
    }

}
