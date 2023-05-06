package com.example.carrentalproject.services;

import com.example.carrentalproject.models.Booking;
import java.util.List;

public interface BookingService {
    /**
     * To get all bookings
     * @return a list of booking
     */
    List<Booking> getAllBookings();

    /**
     * To get booking by id
     * @param id Id
     * @return booking by id
     */
    Booking getBookingById(Long id);

    /**
     * To add a booking
     * @param booking Booking
     * @return
     */
    Booking addBooking(Booking booking);

    /**
     * To update a booking
     * @param booking Booking
     */
    void updateBooking(Booking booking);

    /**
     * To delete a booking
     * @param id
     */
    void deleteBooking(Long id);
}