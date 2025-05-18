package com.example.userDemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.userDemo.model.userModel;
import com.example.userDemo.service.userService;
import com.example.userDemo.service.userServiceImpl;

@RestController
public class userController {

    // @Autowired
    // userService userService;
    userService userService=new userServiceImpl();
    // Get
    @GetMapping("/user")
    public List<userModel> getAllUsers() {
        // Logic to retrieve all users

        return userService.readUsers();
    }

    // Post
    @PostMapping("/user")
    public String createUser(@RequestBody userModel user) {
        return userService.createUser(user);
    }

    // Delete
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id) {
        System.out.println("Deleting user with ID: " + id);
        if (userService.deleteUser(id)) {
            return "User deleted successfully";
        } else {
            return "User not found";
        }
    }
}
