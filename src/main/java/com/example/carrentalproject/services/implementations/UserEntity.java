package com.example.carrentalproject.services.implementations;

public class UserEntity {
    private String username;
    private String password;
    private String fullName;
    private Role role;

    // getters and setters

    public enum Role {
        ROLE_USER,
        ROLE_ADMIN
    }
}