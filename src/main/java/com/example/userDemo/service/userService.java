package com.example.userDemo.service;

import java.util.List;

import com.example.userDemo.model.userModel;

public interface userService {
    String createUser(userModel user);
    List<userModel> readUsers();
    boolean deleteUser(int id);
}
