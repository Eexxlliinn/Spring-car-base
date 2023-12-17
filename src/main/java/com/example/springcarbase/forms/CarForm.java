package com.example.springcarbase.forms;

import com.example.springcarbase.entities.Car;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class CarForm {

    private String car_id;

    private String carNumber;

    private String model;

    private String capacity;

    private String status;

    public Car toCar() {
        return new Car(carNumber, model, capacity, status);
    }
}
