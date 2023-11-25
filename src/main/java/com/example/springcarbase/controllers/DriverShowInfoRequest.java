package com.example.springcarbase.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/cabinet/show-info")
public class DriverShowInfoRequest {

    @GetMapping
    public String showInfo() {
        return "driver_show_info";
    }
}
