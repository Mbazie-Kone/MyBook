package com.mbaziekone.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbaziekone.model.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@GetMapping
	public List<User> getAllUsers() {
		
		return List.of(
			new User(1,"Mario"),
			new User(2, "Maria")
		);
	}
}
