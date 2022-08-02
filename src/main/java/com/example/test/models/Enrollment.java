package com.example.test.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "enrollment")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11, nullable = false, unique = true)
    private Integer enrollmentId;

    @Column(name = "name", length = 20, nullable = true)
    private String name;

    @OneToOne(mappedBy = "enrollment")
    private Student student;

    public Enrollment setEnrollmentId(Integer enrollmentId) {
        this.enrollmentId = enrollmentId;
        return this;
    }

    public Enrollment setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getEnrollmentId() {
        return enrollmentId;
    }

    public String getName() {
        return name;
    }

    public Enrollment setStudent(Student student) {
        this.student = student;
        return this;
    }

}
