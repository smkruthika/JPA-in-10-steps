package com.kru.learning.jpa.jpain10stage.service;

import javax.persistence.*;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.kru.learning.jpa.jpain10stage.entity.User;

//Its a repository as we are saving to DB
@Repository
@Transactional
public class UserDaoService {

	//Create an instance of EntityManager
	@PersistenceContext
	private EntityManager entityManager;
	
	//Function to insert user to DB
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
	
}
