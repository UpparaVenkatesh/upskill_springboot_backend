package com.rll.elearning.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rll.elearning.model.User;
import com.rll.elearning.model.UserLogin;
import com.rll.elearning.repository.UserLoginRepo;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
public class UserLoginController {

	@Autowired
	private UserLoginRepo loginRepo;
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody UserLogin userData){
		UserLogin userLogin=loginRepo.findByUserId(userData.getUserId());
		if(userLogin.getPassword().equals(userData.getPassword()))
			return ResponseEntity.ok(userLogin);
		
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}
	
	
}
