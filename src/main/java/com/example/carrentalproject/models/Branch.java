package com.example.carrentalproject.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "branches")
public class Branch {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    @ManyToMany
    private List<Employee> officeEmployees;

    @OneToMany(mappedBy = "branch")
    private List<Car> availableCars;
}