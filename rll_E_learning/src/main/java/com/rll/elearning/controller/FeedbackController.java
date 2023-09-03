package com.rll.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rll.elearning.model.Feedback;
import com.rll.elearning.model.User;
import com.rll.elearning.repository.FeedbackRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FeedbackController {

	@Autowired
	private  FeedbackRepo feedbackRepo;
	@PostMapping("/registerFeedback")
	public ResponseEntity<Feedback> registerFeedback(@RequestBody Feedback feedback) {
		
	 System.out.println("Controller called");
	 return ResponseEntity.ok(feedbackRepo.save(feedback));
		
	}
	@GetMapping("/getFeedback")
	public ResponseEntity<List<Feedback>> getFeedback(){
		
		return ResponseEntity.ok(feedbackRepo.findAll());
	}
}
