package com.example.carrentalproject.models;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;
/*
CREATED BASED ON BOOKING
 */
@Data
@Table(name = "rentals")
public class Rental {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Temporal(TemporalType.TIMESTAMP)
    private Date rentalDate;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    private String comments;
}