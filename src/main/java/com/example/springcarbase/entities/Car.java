package com.example.springcarbase.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String car_number;

    private String model;

    private String capacity;

    private String status;

}
