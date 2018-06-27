package com.thinkxfactor.zomatoplus.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repo.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user)
	{
	User persistedUser=userRepository.save(user);
		return persistedUser;
	}

	@GetMapping("/getAll")
	public List<User> usergetAll() 
	{
		List<User> users=userRepository.findAll();
		return users;
		/*
		User user2=new User("Zimbo","burkha");
		User user3=new User("Alpha","hubba");
		
		List userList=new ArrayList();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		return userList;
		*/
	}
	
/*	@GetMapping("/create")
	public User create(@RequestParam(value="username") String username, @RequestParam(value="password") String password) 
	{
		User user1=new User(username,password);
		return user1;

	}
*/	
	@PostMapping("/create")
	public User create(@RequestBody User user)
	{
		System.out.println(user.toString());
		return user;
	}
}
