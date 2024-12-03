package com.Pham.DucThang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/admin/home")
    public String adminHome() {
        return "Welcome Admin!";
    }
}
