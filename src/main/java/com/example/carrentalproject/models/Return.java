package com.example.carrentalproject.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
public class Return {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Employee employee;
    private Date returnDate;
    private Booking booking;
    private double additionalPayment;
    private String comments;


}