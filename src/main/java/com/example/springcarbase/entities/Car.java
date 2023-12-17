package com.example.springcarbase.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Table(name = "Cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String carNumber;

    private String model;

    private String capacity;

    private String status;

    public Car(String carNumber, String model, String capacity, String status) {
        this.carNumber = carNumber;
        this.model = model;
        this.capacity = capacity;
        this.status = status;
    }
}
