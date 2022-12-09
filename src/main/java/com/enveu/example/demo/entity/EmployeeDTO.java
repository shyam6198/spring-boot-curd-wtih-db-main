package com.enveu.example.demo.entity;

public class EmployeeDTO {
    public int id;
    public String name;
    public String department;

    public EmployeeDTO(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public EmployeeDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
