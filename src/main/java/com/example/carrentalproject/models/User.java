package com.example.carrentalproject.models;


import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Auditable;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Data
@Table(name = "users")
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable, Auditable<String, Long, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;
    private String email;
    private String password;
    private String logoType;

    @Enumerated(EnumType.STRING)
    private GrantedAuthority role;

    @ManyToMany
    private List<UserAddress> userAddressList;



    @Override
    public Optional<String> getCreatedBy() {
        return Optional.empty();
    }

    @Override
    public void setCreatedBy(String createdBy) {
        // Set the created-by field to the value passed in
    }

    @Override
    public Optional<LocalDateTime> getCreatedDate() {
        return Optional.empty();
    }

    @Override
    public void setCreatedDate(LocalDateTime localDateTime) {

    }

    @Override
    public Optional<String> getLastModifiedBy() {
        return Optional.empty();
    }

    @Override
    public void setLastModifiedBy(String lastModifiedBy) {
        // Set the last-modified-by field to the value passed in
    }

    @Override
    public Optional<LocalDateTime> getLastModifiedDate() {
        return Optional.empty();
    }

    @Override
    public void setLastModifiedDate(LocalDateTime localDateTime) {

    }

    @Override
    public boolean isNew() {
        return false;
    }


}