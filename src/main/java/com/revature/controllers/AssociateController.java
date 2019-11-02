package com.revature.controllers;

import com.revature.entities.Associate;
import com.revature.entities.Login;
import com.revature.services.AssociateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Provides endpoints for dealing with associates.
 */
@Component
@RestController
public class AssociateController {

	/**
	 * The Associate Service that will get injected into the controller.
	 */
	@Autowired
	AssociateService as;

	/**
	 * Create a new associate.
	 *
	 * @param associate The associate to be created.
	 * @return The newly created associate, with updated fields.
	 */
	@RequestMapping(value = "/associates", method = RequestMethod.POST)
	public Associate createAssociate(@RequestBody Associate associate) {
		return this.as.createAssociate(associate);
	}

	/**
	 * Finds the associate by ID.
	 *
	 * @param id The ID of the associate, passed in the url.
	 * @return The associate with that ID, or null if none found.
	 */
	@RequestMapping(value = "/associates/{id}", method = RequestMethod.GET)
	public Associate getAssociateById(@PathVariable int id) {
		Associate associate = this.as.getAssociateById(id);
		return associate;
	}

	/**
	 * Returns all associates that have a given trainer ID.
	 *
	 * @param id The trainer ID, passed in through the parameters.
	 * @return The set of associates that have the given trainer.
	 */
	@RequestMapping(value = "/associates?t_id={id}", method = RequestMethod.GET)
	public Set<Associate> getAssociatesByTrainerId(@PathVariable int id) {
		Set<Associate> associates = this.as.getAllAssociatesByTrainerId(id);
		return associates;
	}

	/**
	 * Try to log the user in.
	 *
	 * @param login The login info passed in the request body.
	 * @return The associated user, or null if no records match the credentials.
	 */
	@RequestMapping(value = "/associates/login", method = RequestMethod.POST)
	public Associate loginAssociate(@RequestBody Login login) {
		Associate user = this.as.authenticateAssociate(login.getUsername(),
			login.getPassword());
		if (user.equals(null)) {
			return null;
		}
		return user;
	}

	/**
	 * Update an associate given their ID.
	 *
	 * @param associate The associate passed in the request body, to be updated.
	 * @return The newly updated associate.
	 */
	@RequestMapping(value = "/associates/{id}", method = RequestMethod.PUT)
	public Associate updateAssociateById(@RequestBody Associate associate) {
		return this.as.updateAssociate(associate);
	}

	// TODO Delete associate by id
}
