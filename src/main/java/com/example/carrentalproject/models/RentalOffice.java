package com.example.carrentalproject.models;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
public class RentalOffice {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String OfficeName;
    private String internetDomain;
    private String contactAddress;
    private String owner;
    private String logoType;


}
