package com.example.carrentalproject.services;

import com.example.carrentalproject.models.Author;
import exceptions.AuthorNotFoundException;

import java.util.List;

public interface AuthorService {
    /**
     * To find all authors
     *
     * @return a list of authors
     */
    List<Author> findAllAuthors();

    /**
     * To find author by firstName
     *
     * @param firstName Author name
     * @return Author
     */
    Author findAuthorByName(String firstName) throws AuthorNotFoundException;

    /**
     * To create a new author
     *
     * @param author Author
     */
    void createAuthor(Author author);

    Object findAllAuthorities();
}