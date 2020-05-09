package com.kru.learning.jpa.jpain10stage.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kru.learning.jpa.jpain10stage.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
