package com.example.springcarbase.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/cabinet")
public class DriverCabinetController {

    @GetMapping()
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

    @GetMapping("/show-info")
    public String showInfo() {
        return "driver_show_info";
    }

}
