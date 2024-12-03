package com.Pham.DucThang.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary key

    private String name; // Subject name

    @Column(name = "number_of_credits")
    private int numberOfCredits; // Number of credits for the subject

    @Column(name = "lecturer_in_charge")
    private String lecturerInCharge; // Lecturer in charge of the subject

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
    private List<Score> scores; // List of scores associated with this subject

    // Default constructor
    public Subject() {}

    // Constructor with parameters
    public Subject(String name, int numberOfCredits, String lecturerInCharge) {
        this.name = name;
        this.numberOfCredits = numberOfCredits;
        this.lecturerInCharge = lecturerInCharge;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public String getLecturerInCharge() {
        return lecturerInCharge;
    }

    public void setLecturerInCharge(String lecturerInCharge) {
        this.lecturerInCharge = lecturerInCharge;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Subject{id=" + id + ", name='" + name + "', numberOfCredits=" + numberOfCredits +
                ", lecturerInCharge='" + lecturerInCharge + "'}";
    }
}

