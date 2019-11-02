package com.revature.services;

import com.revature.entities.Associate;
import com.revature.entities.Purchase;
import com.revature.entities.Reward;
import com.revature.repositories.AssociateRepository;
import com.revature.repositories.PurchaseRepository;
import com.revature.repositories.RewardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * An implementation of the {@link PurchaseService}.
 */
@Component
public class PurchaseServiceImpl implements PurchaseService {

	/**
	 * The purchase repository to be injected by Spring.
	 */
	@Autowired
	PurchaseRepository pr;
	@Autowired
	AssociateRepository ar;
	@Autowired
	AssociateService as;
	@Autowired
	RewardRepository rr;
	@Autowired
	RewardService rs;

	@Override
	public Purchase createPurchase(Purchase purchase) {
		int rewardId = purchase.getRewardId();
		Reward rewardBought = rr.findById(rewardId).get();
		int associateId = purchase.getAssociateId();
		Associate buyer = ar.findById(associateId).get();
		
		//Lowers the stock of the reward by 1, then updates the database
		rewardBought.setStock(rewardBought.getStock() - 1);
		rs.updateReward(rewardBought);
		
		//Removes the cost of the reward from the user, then updates the database
		buyer.setBalance(buyer.getBalance() - rewardBought.getPrice());
		as.updateAssociate(buyer);
		
		return this.pr.save(purchase);
	}

	@Override
	public boolean deletePurchase(Purchase purchase) {
		try {
			this.pr.delete(purchase);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public Set<Purchase> getAllPurchases() {
		Set<Purchase> purchases = new HashSet<>();
		this.pr.findAll().forEach((elem) -> {
			purchases.add(elem);
		});
		return purchases;
	}

	@Override
	public Set<Purchase> getAllPurchasesByAssociateId(int id) {
		Set<Purchase> purchases = this.pr.findByAssociateId(id);
		return purchases;
	}

	@Override
	public Purchase getPurchaseById(int id) {
		Purchase purchase = this.pr.findById(id).get();
		return purchase;
	}

	@Override
	public Purchase updatePurchase(Purchase purchase) {
		return this.pr.save(purchase);
	}

}
