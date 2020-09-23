package com.ecommerce.backend.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.backend.model.User;
import com.ecommerce.backend.repository.UserRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/app")
public class UserController {

	
	    @Autowired
	    private UserRepository userRepository;
	 
	    //GET ALL USERS
	 
	    @GetMapping("/users")
	    public List<User> getAllUsers(Model model) {
	        return this.userRepository.findAll();
	    }  	
	    
}
