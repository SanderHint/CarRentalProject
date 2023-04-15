package com.example.carrentalproject.services;

import com.example.carrentalproject.models.Booking;
import java.util.List;

public interface BookingService {
    List<Booking> getAllBookings();
    Booking getBookingById(Long id);
    Booking addBooking(Booking booking);
    void updateBooking(Booking booking);
    void deleteBooking(Long id);
}