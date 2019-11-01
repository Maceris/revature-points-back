package com.revature.services;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.entities.Associate;
import com.revature.entities.Purchase;
import com.revature.entities.Reward;
import com.revature.repositories.RewardRepository;

@Component
public class RewardServiceImpl implements RewardService{
	
	@Autowired
	RewardRepository rr;
	@Autowired
	PurchaseService ps;

	@Override
	public Reward createReward(Reward reward) {
		reward = rr.save(reward);
		return reward;
	}

	@Override
	public Reward getRewardById(int id) {
		Reward reward = rr.findById(id).get();
		return reward;
	}

	@Override
	public Set<Reward> getAllRewards() {
		Set<Reward> rewards = new HashSet<Reward>((Collection<? extends Reward>) rr.findAll());
		return rewards;
	}

	@Override
	public Set<Reward> getAllRewardsByAssociate(Associate associate) {
		Set<Purchase> associatePurchases = ps.getAllPurchasesByAssociateId(associate.getAssociateId());
		Set<Reward> associateRewards = new HashSet<Reward>();
		for (Iterator<Purchase> it = associatePurchases.iterator(); it.hasNext(); ) {
	        int rewardId = it.next().getRewardId();
	        Reward reward = rr.findById(rewardId).get();
	        associateRewards.add(reward);
	    }
		return associateRewards;
	}

	@Override
	public Reward updateReward(Reward reward) {
		reward = rr.save(reward);
		return reward;
	}

	@Override
	public boolean deleteReward(Reward reward) {
		try {
			rr.delete(reward);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
}
