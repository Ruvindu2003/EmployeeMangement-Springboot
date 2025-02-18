package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Employee;
import org.example.entity.Employee_entity;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeServices;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class Employeeimpl  implements EmployeeServices {
    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;


    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(modelMapper.map(employee, Employee_entity.class));


    }

    @Override
    public Employee searchByID(String id) {
        return modelMapper.map(employeeRepository.findById(id),Employee.class);

    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(modelMapper.map(employee,Employee_entity.class));


    }

    @Override
    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);


    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList=new ArrayList<>();
        List<Employee_entity> all= employeeRepository.findAll();

        all.forEach(employeeEntity -> {
            employeeList.add(modelMapper.map(employeeEntity,Employee.class));
        });


        return employeeList;
    }
}
