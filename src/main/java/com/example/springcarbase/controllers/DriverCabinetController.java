package com.example.springcarbase.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/cabinet")
public class DriverCabinetController {

    @GetMapping()
    public String cabinet() {
        return "driver_cabinet";
    }


}
