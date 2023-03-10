package com.example.usermanagerdemogit.model.service;

import com.example.usermanagerdemogit.model.User;

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
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                return users.get(i);
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
