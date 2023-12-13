package com.example.springcarbase.security;

import com.example.springcarbase.entities.Role;
import com.example.springcarbase.entities.User;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
@Slf4j
public class RegistrationForm {
    private String login;
    private String password;

    public User toUser(PasswordEncoder passwordEncoder) {
        Role role = new Role();
        role.setId(1L);
        role.setRole_name("USER");
        log.info("Role: {}", role);
        return new User(login, passwordEncoder.encode(password), role);
    }
}
