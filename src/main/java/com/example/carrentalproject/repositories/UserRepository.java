package com.example.carrentalproject.repositories;

import com.example.carrentalproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByFullName(String fullName);

    Optional<User> findById(Long id);
}