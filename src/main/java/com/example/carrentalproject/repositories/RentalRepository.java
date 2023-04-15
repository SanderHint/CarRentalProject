package com.example.carrentalproject.repositories;

import com.example.carrentalproject.models.Booking;
import com.example.carrentalproject.models.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {

    Optional<Rental> findByBooking(Booking booking);
}
