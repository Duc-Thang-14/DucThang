package com.Pham.DucThang.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Trả về trang login.html
    }

//    @GetMapping("/default")
//    public String defaultAfterLogin() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String username = authentication.getName(); // Lấy tên người dùng
//
//        if (authentication.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"))) {
//            return "redirect:/admin/home"; // Chuyển hướng admin
//        } else if (authentication.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_STUDENT"))) {
//            return "redirect:/student/home"; // Chuyển hướng student
//        }
//        return "redirect:/login";
//    }
}
