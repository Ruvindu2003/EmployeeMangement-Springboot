package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Employee;
import org.example.service.EmployeeServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
@RequiredArgsConstructor

public class EmployeeController {
    final EmployeeServices employeeServices;

    @PostMapping("/Employee-add")

    public  void addEmployee(@RequestBody Employee employee){
        employeeServices.addEmployee(employee);

    }
    @GetMapping("/Employee-search-by-id/{id}")

    public Employee searchEmployee(@PathVariable String id){
        Employee employee = employeeServices.searchByID(id);
        System.out.println(employee);

        return employee;

    }
    @GetMapping("/Employee-search-by-name/{name}")
    public List<Employee> searchByName(@PathVariable String name){
        return employeeServices.searchByName(name);

    }

    @PutMapping("/Employee-update")

    public void updateEmployee(@RequestBody Employee employee){
        employeeServices.updateEmployee(employee);
    }

    @DeleteMapping("/Employee-Delete/{id}")

    public void  deleteEmployee(@PathVariable String id){
        employeeServices.deleteEmployee(id);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployee(){
       return employeeServices.getAll();

    }


}
