package com.enveu.example.demo.service;

import com.enveu.example.demo.entity.Employee;
import com.enveu.example.demo.entity.EmployeeDTO;

import java.util.List;
import java.util.Optional;
//Author Name - Shyam Kumar
public interface EmployeeServiceInterface {
    Employee saveEmployee(Employee employee);

    List<EmployeeDTO> fetchEmployeeList();

    Employee employeeUpdate(Integer id,Employee employee );

    Void deleteEmployeeById(Integer id);

    Optional<Employee> details(Integer id);
}
