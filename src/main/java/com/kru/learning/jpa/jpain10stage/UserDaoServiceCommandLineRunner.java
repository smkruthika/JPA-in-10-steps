package com.kru.learning.jpa.jpain10stage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.*;

import com.kru.learning.jpa.jpain10stage.entity.User;
import com.kru.learning.jpa.jpain10stage.service.UserDaoService;

//Make it component - This will be called upon application start up
@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDaoService userDaoService;
	
	//override run method
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// Add a user to DB using UserDaoService
		User user = new User("Jack", "admin");
		long id = userDaoService.insert(user);
		log.info("New user created " + user);
	}

	
}
