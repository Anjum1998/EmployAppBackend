package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {
    @GetMapping("/")
    public String WelcomePage()
    {
        return "Welcome to welcome page";
    }
}
