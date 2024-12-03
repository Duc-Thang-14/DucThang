package com.Pham.DucThang.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String name;
    private String birthday;
    private String gender;
    private String address;
    private String phone;
    private String email;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Score> scores; // 1:N relationship with SCORE table

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private StudentDetail studentDetail; // 1:1 relationship with STUDENT_DETAIL table

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Rating> ratings; // 1:N relationship with RATING table

    // Getters and Setters
}

