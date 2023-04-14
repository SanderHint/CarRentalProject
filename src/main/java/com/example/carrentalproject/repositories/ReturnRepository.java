package com.example.carrentalproject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.carrentalproject.models.Return;

public interface ReturnRepository extends CrudRepository<Return, Long> {
    // add any custom query methods here
}