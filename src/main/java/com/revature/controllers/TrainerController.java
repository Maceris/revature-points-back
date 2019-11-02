package com.revature.controllers;

import com.revature.entities.Login;
import com.revature.entities.Trainer;
import com.revature.services.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Provides endpoints for dealing with trainers.
 */
@Component
@RestController
public class TrainerController {

	/**
	 * The Trainer Service that will get injected into the controller.
	 */
	@Autowired
	TrainerService ts;

	/**
	 * Create a trainer, using the info passed in the request body.
	 * 
	 * @param trainer The trainer to create.
	 * @return The newly created trainer.
	 */
	@RequestMapping(value = "/trainers", method = RequestMethod.POST)
	public Trainer createTrainer(@RequestBody Trainer trainer) {
		return ts.createTrainer(trainer);
	}

	/**
	 * Try to log the user in.
	 * 
	 * @param login The login info passed in the request body.
	 * @return The associated user, or null if no records match the credentials.
	 */
	@RequestMapping(value = "/trainers/login", method = RequestMethod.POST)
	public Trainer loginTrainer(@RequestBody Login login) {
		Trainer user =
			ts.authenticateTrainer(login.getUsername(), login.getPassword());
		if (user.equals(null)) {
			return null;
		}
		return user;
	}

	/**
	 * Finds the trainer with the given ID.
	 * 
	 * @param id The ID of the trainer, passed in through the URL.
	 * @return The trainer with that ID or null if it is not found.
	 */
	@RequestMapping(value = "/trainers/{id}", method = RequestMethod.GET)
	public Trainer getTrainerById(@PathVariable int id) {
		Trainer trainer = ts.getTrainerById(id);
		return trainer;
	}

	/**
	 * Update a trainer given their ID.
	 * 
	 * @param trainer The trainer info passed in the request body.
	 * @return The updated trainer.
	 */
	@RequestMapping(value = "/trainers/{id}", method = RequestMethod.PUT)
	public Trainer updateTrainerById(@RequestBody Trainer trainer) {
		return ts.updateTrainer(trainer);
	}

}
