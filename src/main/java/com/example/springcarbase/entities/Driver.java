package com.example.springcarbase.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Table(name = "Drivers")
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
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car car;

    @OneToOne
    @JoinColumn(name = "request_id", referencedColumnName = "id")
    private Request request_id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public Driver(String fullName, String age, String licenseNumber, String category, String phoneNumber) {
        this.full_name = fullName;
        this.age = age;
        this.license_number = licenseNumber;
        this.category = category;
        this.phone_number = phoneNumber;
    }
}
