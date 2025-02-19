package org.example.service;

import org.example.dto.Employee;

import javax.lang.model.element.Name;
import java.util.List;

public interface EmployeeServices {

    void addEmployee(Employee employee);
    Employee searchByID(String id);
    void updateEmployee(Employee employee);

    void deleteEmployee(String id);
    List<Employee>getAll();
    List<Employee> searchByName(String name);
}
