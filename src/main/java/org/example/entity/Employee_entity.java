package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employee")


public class Employee_entity {
    @Id
    private String id;
    private String name;
    private String position;
    private String department;
    private Double salary;
    private  String date_of_hire;
    private  String  phone_Number;
    private String email;



}
