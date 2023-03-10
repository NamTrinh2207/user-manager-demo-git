package com.example.usermanagerdemogit.model.service;

import com.example.usermanagerdemogit.model.User;

import java.util.List;

public interface IUser {
    List<User> findAll();

    void addUser(User user);

    User findById(int id);

    void updateUser(int id, User user);

    void deleteUser(int id);
}
