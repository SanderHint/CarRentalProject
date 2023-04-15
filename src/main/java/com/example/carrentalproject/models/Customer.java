package com.example.carrentalproject.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String email;
    private String address;


}
