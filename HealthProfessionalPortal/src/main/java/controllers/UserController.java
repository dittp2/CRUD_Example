package controllers;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.User;
import com.example.repositories.UserRepository;


@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUsers(@PathVariable Long id) {
		return userRepository.findOne(id);
	}
	
//	@GetMapping("/users/{id}")
//	public Optional<User> getUsers(@PathVariable Long id) {
//		return userRepository.findById(id);
//	}
	
	@DeleteMapping("/users/{id}")
	public boolean deleteUser(@PathVariable Long id) {
		userRepository.delete(id);
		return true;
	}

	@PostMapping("/user")
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	@PutMapping("/user")
	public User updateUser(User user) {
		return userRepository.save(user);
	}	

}
