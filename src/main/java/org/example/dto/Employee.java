package org.example.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Employee {

    private String id;
    private String name;
    private String position;
    private String department;
    private Double salary;
    private  String date_of_hire;
    private  String  phone_Number;
    private String email;



}
