package com.example.employee_backend.dao;

import com.example.employee_backend.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployDao extends CrudRepository<Employee,Integer> {
    @Query(value = "SELECT `id`, `company`, `designation`, `emp_code`, `emp_name`, `mobile`, `password`, `salary`, `username` FROM `employ` WHERE `emp_code`= :empCode",nativeQuery = true)
    List<Employee> SearchEmploy(@Param("empCode") Integer empCode);
}
