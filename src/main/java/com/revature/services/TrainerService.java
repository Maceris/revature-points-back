package com.revature.services;

import com.revature.entities.Trainer;

import java.util.Set;

/**
 * A service for dealing with trainers.
 */
public interface TrainerService {

	/**
	 * Check the supplied username and password and return the trainer they
	 * match.
	 *
	 * @param username The username.
	 * @param password The plaintext password.
	 * @return The trainer with matching credentials, or null if none match.
	 * @apiNote Ches hates everything about the plaintext password.
	 */
	Trainer authenticateTrainer(String username, String password);

	/**
	 * Persist a trainer, may update fields, and returns the newly created
	 * trainer.
	 *
	 * @param trainer The trainer to create.
	 * @return The trainer with updated fields.
	 */
	Trainer createTrainer(Trainer trainer);

	/**
	 * Delete a trainer in the system.
	 *
	 * @param trainer The trainer to delete.
	 * @return True on success, false if there was a problem.
	 */
	boolean deleteTrainer(Trainer trainer);

	/**
	 * Return all trainers.
	 *
	 * @return The set of all trainers.
	 */
	Set<Trainer> getAllTrainers();

	Trainer getTopTrainer();

	/**
	 * Return the trainer with the given trainer ID.
	 *
	 * @param id The ID to look up.
	 * @return The trainer with the given ID, or null if none have that ID.
	 */
	Trainer getTrainerById(int id);

	Trainer getTrainerByName(String name);

	Set<Trainer> getTrainersAbovePointValue(int pointValue);

	/**
	 * Update a trainer and return it.
	 *
	 * @param trainer The trainer to update.
	 * @return The newly updated trainer.
	 */
	Trainer updateTrainer(Trainer trainer);
}
