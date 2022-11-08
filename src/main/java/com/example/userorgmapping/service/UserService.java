package com.example.userorgmapping.service;

import com.example.userorgmapping.entities.User;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(int id);
    List<User> getAllUsers(Pageable pageable);
    User createUser(User user);
    String deleteUserById(int id);
    String deleteAllUsers();
    User updateUser(User user);
}
