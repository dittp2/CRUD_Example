package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import com.example.entities.User;
import com.example.repositories.UserRepository;

// Searches for BasePackages in the defined packages
@SpringBootApplication(scanBasePackages={
		"com.example.repositories", "com.example.entities", "com.examplecontrollers","com.example.demo"})
public class HealthProfessionalPortalApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String...args) {
		SpringApplication.run(HealthProfessionalPortalApplication.class, args);
		
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("one", "one"));
		userRepository.save(new User("two", "two"));
		userRepository.save(new User("three", "three1"));
	
	}
}
