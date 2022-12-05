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
    @GetMapping("/add")
    public String AddEmploy()
    {
        return "Welcome to add employee page";
    }
    @GetMapping("/search")
    public String SearchEmploy()
    {
        return "Welcome to search employee page";
    }
    @GetMapping("/edit")
    public String EditEmploy()
    {
        return "Welcome to edit employee page";
    }
}
