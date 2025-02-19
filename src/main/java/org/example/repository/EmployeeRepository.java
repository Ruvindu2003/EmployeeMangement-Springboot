package org.example.repository;

import org.example.entity.Employee_entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee_entity,String> {
    List<Employee_entity> findByName(String name);
}
