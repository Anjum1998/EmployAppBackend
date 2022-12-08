package com.example.employee_backend.dao;

import com.example.employee_backend.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployDao extends CrudRepository<Employee,Integer> {
    @Query(value = "SELECT `id`, `company`, `designation`, `emp_code`, `emp_name`, `mobile`, `password`, `salary`, `username` FROM `employ` WHERE `emp_code`= :empCode",nativeQuery = true)
    List<Employee> SearchEmploy(@Param("empCode") Integer empCode);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `employ` WHERE id= :id",nativeQuery = true)
    void DeleteEmploy(@Param("id") Integer id);
}
