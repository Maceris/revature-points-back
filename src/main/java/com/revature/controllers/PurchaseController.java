package com.revature.controllers;

import com.revature.entities.Purchase;
import com.revature.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	/**
	 * Create a new purchase.
	 *
	 * @param purchase The purchase to create.
	 * @return The newly created purchase, with updated values.
	 */
	@RequestMapping(value = "/purchases", method = RequestMethod.POST)
	public Purchase createPurchase(@RequestBody Purchase purchase) {
		return this.ps.createPurchase(purchase);
	}

	/**
	 * Returns a purchase given the purchase ID.
	 *
	 * @param id The purchase ID to look up.
	 * @return The purchase with that ID.
	 */
	@RequestMapping(value = "/purchases/{id}", method = RequestMethod.DELETE)
	public Purchase deletePurchaseById(@PathVariable int id) {
		Purchase purchase = this.ps.getPurchaseById(id);
		this.ps.deletePurchase(purchase);
		return purchase;
	}

	/**
	 * Returns the purchases that were purchased by the given associate, or the
	 * set of all purchases in the system if the id is not specified.
	 *
	 * @param id The associate ID, passed in through the parameters.
	 * @return The purchases for the given associate.
	 */
	@RequestMapping(value = "/purchases", method = RequestMethod.GET)
	public Set<Purchase> getAllPurchasesByAssociate(
		@RequestParam(value = "a_id", required = false) Integer id) {
		Set<Purchase> purchases;
		if (id == null) {
			purchases = this.ps.getAllPurchases();
		}
		else {
			purchases = this.ps.getAllPurchasesByAssociateId(id);
		}
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
		Purchase purchase = this.ps.getPurchaseById(id);
		return purchase;
	}

}
