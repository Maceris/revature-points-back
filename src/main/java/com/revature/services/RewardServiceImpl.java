package com.revature.services;

import com.revature.entities.Associate;
import com.revature.entities.Purchase;
import com.revature.entities.Reward;
import com.revature.repositories.RewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * An implementation of the {@link RewardService}.
 */
@Component
public class RewardServiceImpl implements RewardService {

	/**
	 * The reward repository to be injected by Spring.
	 */
	@Autowired
	RewardRepository rr;
	/**
	 * The purchase service to be injected by Spring.
	 */
	@Autowired
	PurchaseService ps;

	@Override
	public Reward createReward(Reward reward) {
		return this.rr.save(reward);
	}

	@Override
	public boolean deleteReward(Reward reward) {
		try {
			this.rr.delete(reward);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public Set<Reward> getAllRewards() {
		Set<Reward> rewards = new HashSet<>();
		this.rr.findAll().forEach((elem) -> {
			rewards.add(elem);
		});
		return rewards;
	}

	@Override
	public Set<Reward> getAllRewardsByAssociate(Associate associate) {
		Set<Purchase> associatePurchases =
			this.ps.getAllPurchasesByAssociateId(associate.getAssociateId());
		Set<Reward> associateRewards = new HashSet<>();
		for (Iterator<Purchase> it = associatePurchases.iterator(); it
			.hasNext();) {
			int rewardId = it.next().getRewardId();
			Reward reward = this.rr.findById(rewardId).get();
			associateRewards.add(reward);
		}
		return associateRewards;
	}

	@Override
	public Reward getRewardById(int id) {
		Reward reward = this.rr.findById(id).get();
		return reward;
	}

	@Override
	public Reward updateReward(Reward reward) {
		return this.rr.save(reward);
	}
}
