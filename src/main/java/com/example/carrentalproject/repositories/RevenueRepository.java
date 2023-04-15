package com.example.carrentalproject.repositories;

import com.example.carrentalproject.models.Booking;
import com.example.carrentalproject.models.Revenue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RevenueRepository extends JpaRepository<Revenue, Long> {
    Optional<Revenue> findByBookings(List<Booking> bookings);

}
