package com.example.springcarbase.repositories;

import com.example.springcarbase.entities.Role;
import com.example.springcarbase.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);

    boolean existsByUsernameAndRole(String username, Role role);
}
