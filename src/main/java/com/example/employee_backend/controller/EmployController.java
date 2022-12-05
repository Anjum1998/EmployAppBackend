package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {
    @PostMapping("/")
    public String WelcomePage()
    {
        return "Welcome to employee page";
    }
    @PostMapping("/add")
    public String AddEmploy()
    {
        return "Welcome to add employee page";
    }
    @PostMapping("/search")
    public String SearchEmploy()
    {
        return "Welcome to search employee page";
    }
    @PostMapping("/edit")
    public String EditEmploy()
    {
        return "Welcome to edit employee page";
    }
    @GetMapping("/view")
    public String ViewAll()
    {
        return "Welcome to view all employee page";
    }
    @PostMapping("/delete")
    public String DeleteEmploy()
    {
        return "Welcome to delete employee page";
    }
}
