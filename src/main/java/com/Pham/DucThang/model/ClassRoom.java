package com.Pham.DucThang.model;

import jakarta.persistence.*;

@Entity
@Table(name = "classroom")
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classId;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subject; // Foreign key referring to the SUBJECT table

    private String className;
    private String lecturer;
    private String scheduleTime;

    // Getters and Setters
}

