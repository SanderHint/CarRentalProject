package com.example.carrentalproject.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@EqualsAndHashCode(callSuper = true)

@Data
public class Author extends Auditable<String> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private boolean isActive;

    public Author() {}

    public Author(String firstName, boolean isActive) {
        this.firstName = firstName;
        this.isActive = isActive;
    }
}