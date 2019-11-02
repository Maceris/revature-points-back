package com.revature.services;

import com.revature.entities.Purchase;
import com.revature.repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
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

	@Override
	public Purchase createPurchase(Purchase purchase) {
		return pr.save(purchase);
	}

	@Override
	public Purchase getPurchaseById(int id) {
		Purchase purchase = pr.findById(id).get();
		return purchase;
	}

	@Override
	public Set<Purchase> getAllPurchases() {
		Set<Purchase> purchases =
			new HashSet<>((Collection<? extends Purchase>) pr.findAll());
		return purchases;
	}

	@Override
	public Set<Purchase> getAllPurchasesByAssociateId(int id) {
		Set<Purchase> purchases = pr.findByAssociateId(id);
		return purchases;
	}

	@Override
	public Purchase updatePurchase(Purchase purchase) {
		return pr.save(purchase);
	}

	@Override
	public boolean deletePurchase(Purchase purchase) {
		try {
			pr.delete(purchase);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

}
