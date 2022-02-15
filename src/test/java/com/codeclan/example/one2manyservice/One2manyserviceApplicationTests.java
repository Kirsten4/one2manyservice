package com.codeclan.example.one2manyservice;

import com.codeclan.example.one2manyservice.models.User;
import com.codeclan.example.one2manyservice.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class One2manyserviceApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUser(){
		User user = new User("Kirsten");
		userRepository.save(user);
	}

}
