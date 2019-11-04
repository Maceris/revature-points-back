package com.revature.controllers;

import com.revature.entities.Reward;
import com.revature.services.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Provides endpoints for dealing with rewards.
 */
@Component
@RestController
public class RewardController {

	/**
	 * The Reward Service that will get injected into the controller.
	 */
	@Autowired
	RewardService rs;

	/**
	 * Create a new reward and return it.
	 *
	 * @param reward The reward to create, passed in the request body.
	 * @return The newly created reward.
	 */
	@RequestMapping(value = "/rewards", method = RequestMethod.POST)
	public Reward createReward(@RequestBody Reward reward) {
		return this.rs.createReward(reward);
	}

	/**
	 * Return the reward that has the given reward ID.
	 *
	 * @param id The ID of the reward, passed in through the url.
	 * @return The reward with that ID.
	 */
	@RequestMapping(value = "/rewards/{id}", method = RequestMethod.DELETE)
	public Reward deleteRewardById(@PathVariable int id) {
		Reward reward = this.rs.getRewardById(id);
		this.rs.deleteReward(reward);
		return reward;
	}

	/**
	 * Returns all the rewards.
	 *
	 * @return The set of all rewards.
	 */

	@RequestMapping(value = "/rewards", method = RequestMethod.GET)
	public Set<Reward> getAllRewards() {
		Set<Reward> rewards = this.rs.getAllRewards();
		return rewards;
	}

	/**
	 * Return the reward that has the given reward ID.
	 *
	 * @param id The ID of the reward, passed in through the url.
	 * @return The reward with that ID.
	 */
	@RequestMapping(value = "/rewards/{id}", method = RequestMethod.GET)
	public Reward getRewardById(@PathVariable int id) {
		Reward reward = this.rs.getRewardById(id);
		return reward;
	}

	/**
	 * Return the reward that has the given reward ID.
	 *
	 * @param id The ID of the reward, passed in through the url.
	 * @param reward The new reward info.
	 * @return The reward with that ID.
	 */
	@RequestMapping(value = "/rewards/{id}", method = RequestMethod.PUT)
	public Reward updateRewardById(@PathVariable int id,
		@RequestBody Reward reward) {
		return this.rs.updateReward(reward);
	}
}
