package com.example.userDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.userDemo.entity.userEntity;
import com.example.userDemo.model.userModel;
import com.example.userDemo.repository.userRepository;

public class userServiceImpl implements userService {

    @Autowired
    userRepository userRepository;
    // List<userModel> users = new ArrayList<>();

    @Override
    public String createUser(userModel user) {
        System.out.println("Reading users");

        userEntity userEntity = new userEntity();
        BeanUtils.copyProperties(user, userEntity);
        userRepository.save(userEntity);
        //users.add(user);
        return "User created successfully";
    }

    @Override
    public List<userModel> readUsers() {
        System.out.println("Reading users");
        List<userEntity> userList = userRepository.findAll();
        List<userModel> userModelList = new ArrayList<>();
    
        for (userEntity entity : userList) {
            userModel user = new userModel();
            user.setId(entity.getId());
            user.setName(entity.getName());
            user.setAge(entity.getAge());
            user.setMobileNumber(entity.getMobileNumber());
            
            userModelList.add(user);
        }
        return userModelList;
    }

    @Override
    public boolean deleteUser(int id) {
        System.out.println("Deleting user with ID1: " + id);
        // users.remove(id);
        return true;
    }
    // List to store user data

}
