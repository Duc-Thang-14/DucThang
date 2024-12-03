package com.Pham.DucThang.model;

import jakarta.persistence.*;

@Entity
@Table(name = "schedule")
public class ClassSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classId;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subject; // Foreign key referring to the SUBJECT table

    private String day;
    private String time;
    private String lecturer;
    private String location;

    // Getters and Setters
}

