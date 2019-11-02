package com.revature.controllers;

import com.revature.entities.Purchase;
import com.revature.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Provides endpoints for dealing with purchases.
 */
@Component
@RestController
public class PurchaseController {

	/**
	 * The Purchase Service that will get injected into the controller.
	 */
	@Autowired
	PurchaseService ps;

	// TODO Create new purchase

	/**
	 * Returns the set of all purchases in the system.
	 * 
	 * @return All purchases.
	 */
	@RequestMapping(value = "/purchases", method = RequestMethod.GET)
	public Set<Purchase> getAllPurchases() {
		Set<Purchase> purchases = ps.getAllPurchases();
		return purchases;
	}

	/**
	 * Returns the purchases that were purchased by the given associate.
	 * 
	 * @param id The associate ID, passed in through the parameters.
	 * @return The purchases for the given associate.
	 */
	@RequestMapping(value = "/purchases?a_id={id}", method = RequestMethod.GET)
	public Set<Purchase> getAllPurchasesByAssociate(@PathVariable int id) {
		Set<Purchase> purchases = ps.getAllPurchasesByAssociateId(id);
		return purchases;
	}

	/**
	 * Returns a purchase given the purchase ID.
	 * 
	 * @param id The purchase ID to look up.
	 * @return The purchase with that ID.
	 */
	@RequestMapping(value = "/purchases/{id}", method = RequestMethod.GET)
	public Purchase getPurchaseById(@PathVariable int id) {
		Purchase purchase = ps.getPurchaseById(id);
		return purchase;
	}

}
