package com.revature.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Associate;
import com.revature.entities.Purchase;
import com.revature.entities.Reward;
import com.revature.entities.Trainer;
import com.revature.services.AssociateService;
import com.revature.services.PurchaseService;
import com.revature.services.RewardService;
import com.revature.services.TrainerService;

@Component
@RestController
public class TrainerController {
	
	@Autowired
	TrainerService ts;
	@Autowired
	AssociateService as;
	@Autowired
	PurchaseService ps;
	@Autowired
	RewardService rs;
	
	//			CREATE
	// Create new trainer
	@RequestMapping(value = "/trainers", method = RequestMethod.POST)
	public Trainer createTrainer(@RequestBody Trainer trainer) {
		trainer = ts.createTrainer(trainer);
		return trainer;
	}
	// Create new reward
	@RequestMapping(value = "/rewards", method = RequestMethod.POST)
	public Reward createReward(@RequestBody Reward reward) {
		reward = rs.createReward(reward);
		return reward;
	}
	
	//			READ
	// Trainer login
	@RequestMapping(value = "/trainers/login", method = RequestMethod.POST)
	public Trainer loginTrainer(@RequestBody Trainer trainer) {
		Trainer user = ts.authenticateTrainer(trainer.getUsername(), trainer.getPassword());
		if(user.equals(null)) {
			return null;
		}
		else {
			return user;
		}
	}
	
	// Get associates for trainer
	@RequestMapping(value = "/associates?t_id={id}", method = RequestMethod.GET)
	public Set<Associate> getAssociatesByTrainerId(@PathVariable int id) {
		Set<Associate> associates = as.getAllAssociatesByTrainerId(id);
		return associates;
	}
	
	// Get trainer by id
	@RequestMapping(value = "/trainers/:{id}", method = RequestMethod.GET)
	public Trainer getTrainerById(@PathVariable int id) {
		Trainer trainer = ts.getTrainerById(id);
		return trainer;
	}
	
	// Get all purchases
	@RequestMapping(value = "/purchases", method = RequestMethod.GET)
	public Set<Purchase> getAllPurchases(){
		Set<Purchase> purchases = ps.getAllPurchases();
		return purchases;
	}
	
	// Get all purchases made by a specific associate
	@RequestMapping(value = "/purchases?a_id={id}", method = RequestMethod.GET)
	public Set<Purchase> getAllPurchasesByAssociate(@PathVariable int id){
		Set<Purchase> purchases = ps.getAllPurchasesByAssociateId(id);
		return purchases;
	}
	
	// Get purchase by id
	@RequestMapping(value = "/purchases/:{id}", method = RequestMethod.GET)
	public Purchase getPurchaseById(@PathVariable int id) {
		Purchase purchase = ps.getPurchaseById(id);
		return purchase;
	}
	
	// Get all rewards
	@RequestMapping(value = "/rewards", method = RequestMethod.GET)
	public Set<Reward> getAllRewards(){
		Set<Reward> rewards = rs.getAllRewards();
		return rewards;
	}
	
	//			UPDATE
	// Update associate by id
	@RequestMapping(value = "/associates/:{id}", method = RequestMethod.PUT)
	public Associate updateAssociateById(@RequestBody Associate associate) {
		associate = as.updateAssociate(associate);
		return associate;
	}
	
	// Update trainer by id
	@RequestMapping(value = "/trainers/:{id}", method = RequestMethod.PUT)
	public Trainer updateTrainerById(@RequestBody Trainer trainer) {
		trainer = ts.updateTrainer(trainer);
		return trainer;
	}
	
	// Update purchase by id
	// Update reward by id
	
	//			DELETE
	// Delete associate by id
	// Delete reward by id

}
