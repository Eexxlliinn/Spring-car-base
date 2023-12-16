package com.example.springcarbase.security;

import com.example.springcarbase.entities.Role;
import com.example.springcarbase.entities.User;
import com.example.springcarbase.repositories.RoleRepository;
import com.example.springcarbase.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    private UserRepository userRepo;
    private RoleRepository roleRepo;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public DataInitializer(UserRepository userRepo, RoleRepository roleRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @EventListener(ContextRefreshedEvent.class)
    public void initializeData() {
        Role adminRole = roleRepo.findByRoleName("ADMIN");
        if (!userRepo.existsByUsernameAndRole("admin", adminRole)) {
            User adminUser = new User("admin", passwordEncoder.encode("admin"), adminRole);
            userRepo.save(adminUser);
        }
    }
}
