package com.example.carrentalproject.models;

import java.math.BigDecimal;
import java.util.List;

public class Revenue {
    private List<Booking> bookings;

    public Revenue(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public BigDecimal calculateRevenue() {
        BigDecimal totalRevenue = BigDecimal.ZERO;
        for (Booking booking : bookings) {
            totalRevenue = totalRevenue.add(booking.getAmount());
        }
        return totalRevenue;
    }
}
