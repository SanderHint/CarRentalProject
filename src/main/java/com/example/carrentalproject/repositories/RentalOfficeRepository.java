package com.example.carrentalproject.repositories;

import com.example.carrentalproject.models.RentalOffice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RentalOfficeRepository extends JpaRepository<RentalOffice, Long> {

    Optional<RentalOffice> findByOfficeName(String officeName);
}
