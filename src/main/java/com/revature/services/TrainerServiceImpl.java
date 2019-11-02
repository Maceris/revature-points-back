package com.revature.services;

import com.revature.entities.Trainer;
import com.revature.repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * An implementation of the {@link TrainerService}.
 */
@Component
public class TrainerServiceImpl implements TrainerService {

	/**
	 * The trainer repository to be injected by Spring.
	 */
	@Autowired
	TrainerRepository tr;

	@Override
	public Trainer createTrainer(Trainer trainer) {
		return tr.save(trainer);
	}

	@Override
	public Trainer getTrainerById(int id) {
		Trainer trainer = tr.findById(id).get();
		return trainer;
	}

	@Override
	public Trainer getTrainerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trainer getTopTrainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Trainer> getTrainersAbovePointValue(int pointValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Trainer> getAllTrainers() {
		Set<Trainer> trainers = new HashSet<>();
		tr.findAll().forEach((elem) -> {
			trainers.add(elem);
		});
		return trainers;
	}

	@Override
	public Trainer updateTrainer(Trainer trainer) {
		return tr.save(trainer);
	}

	@Override
	public boolean deleteTrainer(Trainer trainer) {
		try {
			tr.delete(trainer);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public Trainer authenticateTrainer(String username, String password) {
		Trainer trainer = tr.findByUsername(username);
		if (trainer.getPassword().equals(password)) {
			return trainer;
		}
		return null;
	}
}
