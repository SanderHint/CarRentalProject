package com.example.carrentalproject.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "branches")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    @ManyToMany
    private List<Employee> officeEmployees;

    @OneToMany(mappedBy = "branch")
    private List<Car> availableCars;
}