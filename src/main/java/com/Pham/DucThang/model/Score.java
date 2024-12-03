package com.Pham.DucThang.model;

import jakarta.persistence.*;

@Entity
@Table(name = "score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int score;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student; // Foreign key referring to the STUDENT table

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subject; // Foreign key referring to the SUBJECT table

    // Getters and Setters
}
