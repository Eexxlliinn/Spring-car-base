package com.example.springcarbase.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/admin-cabinet")
public class AdminCabinetController {

    @GetMapping()
    public String adminCabinet() {
        return "admin_cabinet";
    }

    @GetMapping("/create-request")
    public String createRequest() {
        return "admin_create_request";
    }

    @GetMapping("/assign-request")
    public String assignRequest() {
        return "admin_assign_request";
    }

    @GetMapping("/set-car")
    public String setCar() {
        return "admin_car";
    }


}
