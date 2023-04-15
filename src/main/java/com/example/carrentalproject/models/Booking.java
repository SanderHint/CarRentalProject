package com.example.carrentalproject.models;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date bookingDate;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Car car;

    private Date rentalStartDate;
    private Date rentalEndDate;
    private String rentalBranch;
    private String returnBranch;
    private BigDecimal amount;
}