package com.rll.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rll.elearning.model.User;
//import com.rll.elearning.model.Feedback;
import com.rll.elearning.repository.UserRepo;
//import com.rll.elearning.repository.FeedbackRepo;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserRepo repo;
	
	@PostMapping("/user")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		
	 System.out.println("Controller called");
	 return ResponseEntity.ok(repo.save(user));
		
	}
	@CrossOrigin(origins="http://localhost:4200")
//	@RequestMapping("/myprofile")
	@GetMapping("/myprofile/{userId}")
	public ResponseEntity<User> getUser(@PathVariable String userId){
		System.out.println(userId);
		return ResponseEntity.ok(repo.findByUserId(userId));
	}
	
	

}