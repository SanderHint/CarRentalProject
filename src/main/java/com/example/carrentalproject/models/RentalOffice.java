package com.example.carrentalproject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class RentalOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String OfficeName;
    private String internetDomain;
    private String contactAddress;
    private String owner;
    private String logoType;


}
