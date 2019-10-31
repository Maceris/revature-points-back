package com.revature.services;

import java.util.Set;

import com.revature.entities.Purchase;

public interface PurchaseService {
	// Create
	Purchase createPurchase(Purchase purchase);
	// Read
	Purchase getPurchaseById(int id);
	Set<Purchase> getAllPurchases();
	Set<Purchase> getAllPurchasesByAssociateId(int id);
	
	// Update
	Purchase updatePurchase(Purchase purchase);
	
	// Delete
	boolean deletePurchase(Purchase purchase);
}
