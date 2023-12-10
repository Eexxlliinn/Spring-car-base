package com.example.springcarbase.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String full_name;

    private String age;

    private String license_number;

    private String category;

    private String phone_number;

    @OneToOne
    private Car car_id;

    @OneToOne
    private Request request_id;

    @OneToOne
    private User user_id;
}
