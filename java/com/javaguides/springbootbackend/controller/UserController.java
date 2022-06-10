package com.javaguides.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaguides.springbootbackend.model.User;
import com.javaguides.springbootbackend.repository.UserRespository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {
	
	@Autowired
	private UserRespository respository;
	
	@GetMapping("users")
	public List<User> getUsers()
	{
		return this.respository.findAll();
	}

}
