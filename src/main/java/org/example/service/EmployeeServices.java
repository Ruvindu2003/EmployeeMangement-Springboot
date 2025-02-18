package org.example.service;

import org.example.dto.Employee;

import java.util.List;

public interface EmployeeServices {

    void addEmployee(Employee employee);
    Employee searchByID(String id);
    void updateEmployee(Employee employee);

    void deleteEmployee(String id);
    List<Employee>getAll();
}
