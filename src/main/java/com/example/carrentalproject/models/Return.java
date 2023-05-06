package com.example.carrentalproject.models;

import lombok.Data;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import java.util.Date;

@Data
public class Return {

    private GenerationType generationType;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Employee employee;
    private Date returnDate;
    private Booking booking;
    private double additionalPayment;
    private String comments;

}