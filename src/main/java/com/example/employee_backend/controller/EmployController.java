package com.example.employee_backend.controller;

import com.example.employee_backend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {
    @PostMapping("/")
    public String WelcomePage()
    {
        return "Welcome to employee page";
    }
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddEmploy(@RequestBody Employee e)
    {
        System.out.println(e.getEmpCode());
        System.out.println(e.getEmpName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompany().toString());
        System.out.println(e.getMobile().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
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
