package com.example.employee_backend.controller;

import com.example.employee_backend.dao.EmployDao;
import com.example.employee_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map<String,String> AddEmploy(@RequestBody Employee e)
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
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<Employee> SearchEmploy(@RequestBody Employee e)
    {
        String empCode=String.valueOf(e.getEmpCode());
        System.out.println(empCode);

        return (List<Employee>) dao.SearchEmploy(e.getEmpCode());
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
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public Map<String,String> DeleteEmploy(@RequestBody Employee e)
    {
        String id=String.valueOf(e.getId());
        System.out.println(id);
        dao.DeleteEmploy(e.getId());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;

    }
}
