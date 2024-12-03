package com.Pham.DucThang.config;

import com.Pham.DucThang.model.Role;
import com.Pham.DucThang.model.User;
import com.Pham.DucThang.repository.RoleRepository;
import com.Pham.DucThang.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Tạo Role ADMIN nếu chưa có
            Role adminRole = roleRepository.findByName("ADMIN");
            if (adminRole == null) {
                adminRole = new Role();
                adminRole.setName("ADMIN");
                roleRepository.save(adminRole);
            }

            // Tạo Role STUDENT nếu chưa có
            Role studentRole = roleRepository.findByName("STUDENT");
            if (studentRole == null) {
                studentRole = new Role();
                studentRole.setName("STUDENT");
                roleRepository.save(studentRole);
            }

            // Tạo User admin nếu chưa có
            if (userRepository.findByUsername("admin") == null) {
                User admin = new User();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin"));
                admin.setRole(adminRole);
                userRepository.save(admin);
            }

            // Tạo User student nếu chưa có
            if (userRepository.findByUsername("student") == null) {
                User student = new User();
                student.setUsername("student");
                student.setPassword(passwordEncoder.encode("student"));
                student.setRole(studentRole);
                userRepository.save(student);
            }
        };
    }
}

