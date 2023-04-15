package com.example.carrentalproject.repositories;

import com.fasterxml.jackson.annotation.OptBoolean;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.carrentalproject.models.Return;

import java.util.Date;
import java.util.Optional;

public interface ReturnRepository extends JpaRepository<Return, Long> {
    Optional<Return> findByReturnDate(Date returnDate);
}