package com.Pham.DucThang.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Set;

@Controller
public class DefaultController {

    @GetMapping("/default")
    public String defaultAfterLogin(Authentication authentication) {
        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        if (roles.contains("ROLE_ADMIN")) {
            return "redirect:/admin/home";
        }
        if (roles.contains("ROLE_STUDENT")) {
            return "redirect:/student/home";
        }
        return "redirect:/login";
    }
}
