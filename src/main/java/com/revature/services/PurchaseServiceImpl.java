package com.revature.services;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.entities.Purchase;
import com.revature.repositories.PurchaseRepository;

public class PurchaseServiceImpl implements PurchaseService{
	
	@Autowired
	PurchaseRepository pr;

	@Override
	public Purchase createPurchase(Purchase purchase) {
		purchase = pr.save(purchase);
		return purchase;
	}

	@Override
	public Purchase getPurchaseById(int id) {
		Purchase purchase = pr.findById(id).get();
		return purchase;
	}

	@Override
	public Set<Purchase> getAllPurchases() {
		Set<Purchase> purchases = new HashSet<Purchase>((Collection<? extends Purchase>) pr.findAll());
		return purchases;
	}

	@Override
	public Set<Purchase> getAllPurchasesByAssociateId(int id) {
		Set<Purchase> purchases = pr.findByAssociateId(id);
		return purchases;
	}

	@Override
	public Purchase updatePurchase(Purchase purchase) {
		purchase = pr.save(purchase);
		return purchase;
	}

	@Override
	public boolean deletePurchase(Purchase purchase) {
		try {
			pr.delete(purchase);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

}
