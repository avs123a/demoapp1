package com.example.demoapp1.controller;

import com.example.demoapp1.domain.User;
import com.example.demoapp1.domain.UserLoginDTO;
import com.example.demoapp1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	//get all users
	@GetMapping("/list")
	List<User> list() {
		return userRepository.findAll();
	}
	
	//get user by email and password for authorization
	@PostMapping("/auth")
	User auth(@RequestBody UserLoginDTO userLogin) {
		return userRepository.findByEmailAndPassword(userLogin.getEmail(), userLogin.getPassword());
	}

	//get user by id
	@GetMapping("/view/{id}")
	User view(@PathVariable Long id) {
		return userRepository.findOneById(id);
	}

	//create user
	@PostMapping("/add")
	User add(@RequestBody User user) {
		return userRepository.save(user);
	}

	//update user
	@PutMapping("/update")
	User update(@RequestBody User user) {
		return userRepository.save(user);
	}

	//delete user
	@DeleteMapping("/delete/{id}")
	void delete(@PathVariable Long id){
		userRepository.removeById(id);
	}
	
}
