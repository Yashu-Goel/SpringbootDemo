package com.example.userDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class userModel {
    private int id;
    private String name;
    private String mobileNumber;
    private int age;

    
}
