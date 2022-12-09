package com.enveu.example.demo.repository;

import com.enveu.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//Author Name - Shyam Kumar
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
