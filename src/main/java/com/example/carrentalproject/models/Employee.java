package com.example.carrentalproject.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private JobPosition jobPosition;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;
}