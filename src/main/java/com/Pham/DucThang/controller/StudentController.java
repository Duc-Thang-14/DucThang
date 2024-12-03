package com.Pham.DucThang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student/home")
    public String studentHome() {
        return "Welcome Student!";
    }
}
