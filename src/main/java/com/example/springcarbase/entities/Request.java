package com.example.springcarbase.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@Table(name = "Requests")
@NoArgsConstructor
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date requestDate;

    private String distance;

    private String requiredCapacity;

    private String requiredType;

    private String status;

    public Request(String description, Date requestDate, String distance, String requiredCapacity, String requiredType, String status) {
        this.description = description;
        this.requestDate = requestDate;
        this.distance = distance;
        this.requiredCapacity = requiredCapacity;
        this.requiredType = requiredType;
        this.status = status;
    }
}
