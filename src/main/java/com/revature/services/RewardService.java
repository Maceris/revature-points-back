package com.revature.services;

import java.util.Set;

import com.revature.entities.Associate;
import com.revature.entities.Reward;

public interface RewardService {
	// Create
	Reward createReward(Reward reward);
	
	// Read
	Reward getRewardById(int id);
	Set<Reward> getAllRewards();
	Set<Reward> getAllRewardsByAssociate(Associate associate);
	
	// Update
	Reward updateReward(Reward reward);
	
	// Delete
	boolean deleteReward(Reward reward);
}
