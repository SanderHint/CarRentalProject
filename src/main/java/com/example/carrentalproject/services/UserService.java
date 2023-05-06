package com.example.carrentalproject.services;

import exceptions.UserNotFoundException;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    User findUserById(Long id) throws UserNotFoundException;

    /**
     * To find all users
     *
     * @return a list of User
     */
    List<User> findAllUsers();

    /**
     * To find user by fullName
     *
     * @param fullName  fullName
     * @return User
     */
    User findUserByFullName(String fullName) throws UserNotFoundException;

    /**
     * To create a new User
     *
     * @param user User
     */
    void createUser(User user);

    /**
     * To update an existing User
     * @param user User
     */
    void updateUser(User user) throws UserNotFoundException;

    /**
     * To delete a User by fullName
     * @param fullName FullName
     */
    void deleteUserByFullName(String fullName) throws UserNotFoundException;

    /**
     * To restore a User by fullName
     * @param fullName FullName
     */
    void restoreUserByFullName(String fullName) throws UserNotFoundException;
}