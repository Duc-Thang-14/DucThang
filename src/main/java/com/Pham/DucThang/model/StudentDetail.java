package com.Pham.DucThang.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_detail")
public class StudentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @OneToOne
    @JoinColumn(name = "studentId", referencedColumnName = "studentId")
    private Student student; // Foreign key referring to the STUDENT table

    private String studyHistory;
    private String registeredSubjects;
    private String academicResults;

    // Getters and Setters
}

