package com.example.springcarbase.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String role_name;
}
