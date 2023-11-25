package com.example.springcarbase.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/cabinet/set-info")
public class DriverSetInfoController {

    @GetMapping
    public String setInfo() {
        return "driver_set_info";
    }

    @PostMapping
    public String processInfo() {


        return "redirect:/cabinet";
    }
}
