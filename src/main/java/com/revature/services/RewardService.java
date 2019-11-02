package com.revature.services;

import com.revature.entities.Associate;
import com.revature.entities.Reward;

import java.util.Set;

/**
 * A service for dealing with rewards.
 */
public interface RewardService {
	/**
	 * Persist a reward, may update fields, and returns the new reward.
	 * 
	 * @param reward The reward to create.
	 * @return The newly created reward.
	 */
	Reward createReward(Reward reward);

	/**
	 * Return the reward with the given reward ID.
	 * 
	 * @param id The reward ID to look up.
	 * @return The reward with the given ID, or null if none have that ID.
	 */
	Reward getRewardById(int id);

	/**
	 * Return all rewards.
	 * 
	 * @return The set of all rewards.
	 */
	Set<Reward> getAllRewards();

	/**
	 * Return all the rewards that have been purchased by the given associate.
	 * 
	 * @param associate The associate to find rewards for.
	 * @return The set of all rewards purchased by the given associate.
	 */
	Set<Reward> getAllRewardsByAssociate(Associate associate);

	/**
	 * Update and return a reward.
	 * 
	 * @param reward The reward to update.
	 * @return The newly updated reward.
	 */
	Reward updateReward(Reward reward);

	/**
	 * Delete a reward in the system.
	 * 
	 * @param reward The reward to delete.
	 * @return True on success, false if there was a problem.
	 */
	boolean deleteReward(Reward reward);
}
