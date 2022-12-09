package com.enveu.example.demo.controllers;

import com.enveu.example.demo.entity.Employee;
import com.enveu.example.demo.entity.EmployeeDTO;
import com.enveu.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//Author Name - Shyam Kumar
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public Employee addData(@RequestBody Employee employee)
    {
        return employeeService.saveEmployee(employee);
    }
    @DeleteMapping("/delete/{id}")
    public Void deleteData(@PathVariable("id") Integer id)
    {
    return employeeService.deleteEmployeeById(id);
    }
    @PutMapping("update/{id}")
    public Employee update(@PathVariable("id") Integer id, @RequestBody Employee employee){ return employeeService.employeeUpdate(id,employee);}
    @GetMapping("/list")
    public List<EmployeeDTO> listData(){
        return employeeService.fetchEmployeeList();
    }
    @GetMapping("/details/{id}")
    public Optional<Employee> detailsData(@PathVariable("id") Integer id){
        return employeeService.details(id);
    }
	//Author Name - Shyam Kumar
}
