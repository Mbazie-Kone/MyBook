package com.mbaziekone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbaziekone.model.User;
import com.mbaziekone.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getAllUsers() {
		
		return userService.getAllUsers();
	}
	
	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User addUser = userService.addUser(user);
		
		return new ResponseEntity<>(addUser, HttpStatus.CREATED);
	}
}
