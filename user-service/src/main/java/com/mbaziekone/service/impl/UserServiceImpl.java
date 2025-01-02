package com.mbaziekone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbaziekone.model.User;
import com.mbaziekone.repository.UserRepository;
import com.mbaziekone.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
		
	}

	@Override
	public User addUser(User user) {
		
		User users = userRepository.save(user);
		
		return users;
	}

}
