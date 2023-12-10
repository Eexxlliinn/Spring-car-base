package com.example.springcarbase.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date start_date;

    private Date end_date;

    private String status;

    @OneToOne
    private Driver driver_id;
}
