package com.example.service;

import com.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserIplm implements IUser {
    List<User> users = new ArrayList<>();

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void updateUser(int id, User user) {
        users.set(id, user);
    }

    @Override
    public void deleteUser(int id) {
        users.remove(id);
    }
}
