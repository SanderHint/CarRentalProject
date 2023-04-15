package com.example.carrentalproject.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

/*
CREATED BASED ON BOOKING
 */
@Data
@Entity
@Table(name = "rentals")
public class Rental {

    @Id
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