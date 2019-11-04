package com.revature.services;

import com.revature.entities.Purchase;

import java.util.Set;

/**
 * A service for dealing with purchases.
 */
public interface PurchaseService {
	/**
	 * Persist a new purchase, may update fields, and returns the purchase.
	 *
	 * @param purchase The purchase to create.
	 * @return The newly created purchase.
	 */
	Purchase createPurchase(Purchase purchase);

	/**
	 * Delete the specified purchase.
	 *
	 * @param purchase The purchase to delete.
	 * @return True on success, false if there was a problem.
	 */
	boolean deletePurchase(Purchase purchase);

	/**
	 * Return all purchases.
	 *
	 * @return The set of all purchases.
	 */
	Set<Purchase> getAllPurchases();

	/**
	 * Return all purchases that were made by an associate with the specified
	 * ID.
	 *
	 * @param id The associate ID to look for.
	 * @return The set of purchases made by the specified associate.
	 */
	Set<Purchase> getAllPurchasesByAssociateId(int id);

	/**
	 * Return the purchase with the given purchase ID.
	 *
	 * @param id The purchase ID.
	 * @return The purchase with that ID, or null if one cannot be found.
	 */
	Purchase getPurchaseById(int id);

	/**
	 * Update and return the specified purchase.
	 *
	 * @param purchase The purchase to update.
	 * @return The purchase after update.
	 */
	Purchase updatePurchase(Purchase purchase);
}
