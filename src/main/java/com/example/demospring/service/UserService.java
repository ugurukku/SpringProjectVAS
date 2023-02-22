package com.example.demospring.service;

import com.example.demospring.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(int id);

    User saveUser(User user);

    void deleteUser(int id);
}
