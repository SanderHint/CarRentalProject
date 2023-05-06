package com.example.carrentalproject.services.implementations;

import com.example.carrentalproject.models.Author;
import com.example.carrentalproject.repositories.AuthorRepository;
import com.example.carrentalproject.services.AuthorService;
import exceptions.AuthorNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author findAuthorByName(String firstName) throws AuthorNotFoundException {
        Optional<Author> optionalAuthor = authorRepository.findByFirstName(firstName);

        if (optionalAuthor.isEmpty()) {
            throw new AuthorNotFoundException(firstName);
        }

        return optionalAuthor.get();
    }

    @Override
    public void createAuthor(Author author) {
        author.setActive(true);
        authorRepository.save(author);
    }

    @Override
    public Object findAllAuthorities() {
        return null;
    }
}