package com.enveu.example.demo.service;

import com.enveu.example.demo.entity.Employee;
import com.enveu.example.demo.entity.EmployeeDTO;
import com.enveu.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//Author Name - Shyam Kumar
@Service
public class EmployeeService implements EmployeeServiceInterface {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<EmployeeDTO> fetchEmployeeList() {
        return ((List<Employee>) employeeRepository.findAll()).stream().map(this::employeeDto).collect(Collectors.toList());
    }
    public EmployeeDTO employeeDto(Employee employee){
        EmployeeDTO dto=new EmployeeDTO();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setDepartment(employee.getDepartment());
        return dto;
    }

    @Override
    public Employee employeeUpdate(Integer id,Employee employee) {

        Employee emp=employeeRepository.findById(id).get();
        emp.setName(employee.getName());
        emp.setDepartment(employee.getDepartment());
        emp.setSalary(employee.getSalary());
        return employeeRepository.save(emp);
    }

    @Override
    public Void deleteEmployeeById(Integer id) {
        employeeRepository.deleteById(id);
        return null;
    }

    @Override
    public Optional<Employee> details(Integer id) {
        return employeeRepository.findById(id);
    }
}
