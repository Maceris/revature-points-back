package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.TrainerService;

@Component
@RestController
public class TrainerController {
	
	@Autowired
	TrainerService ts;
	
	//			CREATE
	// Create new trainer
	// Create new reward
	
	//			READ
	// Trainer login
	// Get associates for trainer
	// Get trainer by id
	// Get all purchases
	// Get all purchases made by a specific associate
	// Get purchase by id
	// Get all rewards
	
	//			UPDATE
	// Update associate by id
	// Update trainer by id
	// Update purchase by id
	// Update reward by id
	
	//			DELETE
	// Delete associate by id
	// Delete reward by id

}
