package com.revature.services;

import java.util.Set;

import com.revature.entities.Trainer;

public interface TrainerService {

	// Create
		Trainer createTrainer(Trainer trainer);
		
		// Read
		Trainer getTrainerById(int id);
		Trainer getTrainerByName(String name);
		Trainer getTopTrainer();
		Trainer authenticateTrainer(String username, String password);
		Set<Trainer> getTrainersAbovePointValue(int pointValue);
		Set<Trainer> getAllTrainers();
		
		// Update
		Trainer updateTrainer(Trainer trainer);
		
		// Delete
		boolean deleteTrainer(Trainer trainer);
}
