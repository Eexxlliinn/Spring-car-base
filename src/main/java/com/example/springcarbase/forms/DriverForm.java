package com.example.springcarbase.forms;


import com.example.springcarbase.entities.Car;
import com.example.springcarbase.entities.Driver;
import com.example.springcarbase.entities.User;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
@Slf4j
public class DriverForm {
    private String full_name;
    private String age;
    private String license_number;
    private String category;
    private String phone_number;
    private User user_id;
    private Car car_id;

    public Driver toDriver() {
        Driver driver = new Driver(full_name, age, license_number, category, phone_number);
        driver.setUser(user_id);
        driver.setCar(car_id);
        return driver;
    }
}

