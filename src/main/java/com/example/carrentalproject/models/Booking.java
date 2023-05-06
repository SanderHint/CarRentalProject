package com.example.carrentalproject.models;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Table(name = "bookings")
public class Booking {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date bookingDate;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Car car;

    private Date PickUpDate;
    private Date ReturnDate;
    private String rentalBranch;
    private String returnBranch;
    private BigDecimal amount;
}