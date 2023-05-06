package com.example.carrentalproject.models;

import lombok.Data;

import javax.persistence.*;

@Table(name = "employees")
@Data
public class Employee {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private JobPosition jobPosition;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;
}