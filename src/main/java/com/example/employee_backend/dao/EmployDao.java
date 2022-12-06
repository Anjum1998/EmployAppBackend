package com.example.employee_backend.dao;

import com.example.employee_backend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployDao extends CrudRepository<Employee,Integer> {
}
