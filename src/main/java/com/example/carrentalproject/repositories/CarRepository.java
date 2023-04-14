package com.example.carrentalproject.repositories;

import com.example.carrentalproject.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    Optional<Car> findCarBy(String model);

        // methods for managing car data in a database
}
