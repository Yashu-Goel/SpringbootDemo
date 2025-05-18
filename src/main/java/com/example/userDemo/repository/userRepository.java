package com.example.userDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userDemo.entity.userEntity;

public interface userRepository extends JpaRepository<userEntity, Integer> {
	
	
}
