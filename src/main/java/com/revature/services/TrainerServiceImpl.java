package com.revature.services;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.entities.Trainer;
import com.revature.repositories.TrainerRepository;

public class TrainerServiceImpl implements TrainerService {

	@Autowired
	TrainerRepository tr;
	
	@Override
	public Trainer createTrainer(Trainer trainer) {
		trainer = tr.save(trainer);
		return null;
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
		Set<Trainer> trainers = new HashSet<Trainer>((Collection<? extends Trainer>) tr.findAll());
		return trainers;
	}

	@Override
	public Trainer updateTrainer(Trainer trainer) {
		trainer = tr.save(trainer);
		return trainer;
	}

	@Override
	public boolean deleteTrainer(Trainer trainer) {
		try {
			tr.delete(trainer);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

}
