package com.example.springcarbase.controllers;

import com.example.springcarbase.entities.Car;
import com.example.springcarbase.entities.Driver;
import com.example.springcarbase.entities.User;
import com.example.springcarbase.forms.DriverForm;
import com.example.springcarbase.repositories.CarRepository;
import com.example.springcarbase.repositories.DriverRepository;
import com.example.springcarbase.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/cabinet")
public class DriverCabinetController {

    private UserRepository userRepo;
    private DriverRepository driverRepo;
    private CarRepository carRepo;

    @Autowired
    public DriverCabinetController(UserRepository userRepo, DriverRepository driverRepo, CarRepository carRepo) {
        this.userRepo = userRepo;
        this.driverRepo = driverRepo;
        this.carRepo = carRepo;
    }

    @GetMapping
    public String cabinet() {
        return "driver_cabinet";
    }

    @GetMapping("/request")
    public String request() {
        return "driver_request_info";
    }

    @GetMapping("/set-info")
    public String setInfo() {
        return "driver_set_info";
    }

    @PostMapping("/set-info")
    public String processInfo(DriverForm form) {
        User user = loadCurrentUser();
        Driver existingDriver = driverRepo.findByUser(user);
        form.setUser_id(user);
        if (existingDriver != null) {
            existingDriver.setFull_name(form.getFull_name());
            existingDriver.setAge(form.getAge());
            existingDriver.setCategory(form.getCategory());
            existingDriver.setLicense_number(form.getLicense_number());
            existingDriver.setPhone_number(form.getPhone_number());
            driverRepo.save(existingDriver);
        } else {
            driverRepo.save(form.toDriver());
        }

        return "redirect:/cabinet";
    }
    @GetMapping("/show-info")
    public String showInfo(Model model) {
        User user = loadCurrentUser();
        Driver driver = driverRepo.findByUser(user);
        model.addAttribute("driver", driver);
        return "driver_show_info";
    }

    @GetMapping("/show-car")
    public String showCar(Model model) {
        User user = loadCurrentUser();
        Driver driver = driverRepo.findByUser(user);
        model.addAttribute("driver", driver);
        if (driver != null) {
            Car car = driver.getCar();
            model.addAttribute("car", car);
        } else {
            model.addAttribute("car", null);
        }
        return "driver_show_car";
    }

    @GetMapping("/set-car")
    public String setCar(Model model) {
        model.addAttribute("cars", carRepo.findByStatus("Available"));
        return "driver_set_car";
    }
    @PostMapping("/set-car")
    public String processCar(DriverForm form) {
        User user = loadCurrentUser();
        Driver existingDriver = driverRepo.findByUser(user);
        form.setUser_id(user);
        if (existingDriver != null) {
            Car previousCar = existingDriver.getCar();
            existingDriver.setCar(form.getCar_id());
            driverRepo.save(existingDriver);
            Optional<Car> selectedCar = carRepo.findById(form.getCar_id().getId());
            selectedCar.ifPresent(car -> {
                car.setStatus("Not available");
                carRepo.save(car);
            });
            if (previousCar != null) {
                Optional<Car> prevCar = carRepo.findById(previousCar.getId());
                prevCar.ifPresent(car -> {
                    car.setStatus("Available");
                    carRepo.save(car);
                });
            }

        }

        return "redirect:/cabinet";
    }

    private User loadCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String username = userDetails.getUsername();
        return userRepo.findByUsername(username);
    }
}
