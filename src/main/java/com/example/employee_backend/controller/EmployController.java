package com.example.employee_backend.controller;

import com.example.employee_backend.dao.EmployDao;
import com.example.employee_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployController {
    @Autowired
    private EmployDao dao;
    @PostMapping("/")
    public String WelcomePage()
    {
        return "Welcome to employee page";
    }
    @CrossOrigin(origins = "*")
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
        dao.save(e);
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
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> ViewAll()
    {

        return (List<Employee>) dao.findAll();
    }
    @PostMapping("/delete")
    public String DeleteEmploy()
    {
        return "Welcome to delete employee page";
    }
}
