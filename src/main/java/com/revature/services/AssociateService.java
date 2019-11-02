package com.revature.services;

import com.revature.entities.Associate;

import java.util.Set;

/**
 * A service for dealing with associates.
 */
public interface AssociateService {
	/**
	 * Persists an associate, may update fields, and returns the associate. You
	 * should use the returned associate as it likely changed.
	 * 
	 * @param associate The associate to create.
	 * @return The newly created associate.
	 */
	Associate createAssociate(Associate associate);

	/**
	 * Return the associate with the given ID.
	 * 
	 * @param id The associate ID.
	 * @return The associate with the supplied ID, or null if one does not
	 *         exist.
	 */
	Associate getAssociateById(int id);

	Associate getAssociateByName(String name);

	/**
	 * Check the supplied username and password and return the associate they
	 * match.
	 * 
	 * @param username The username.
	 * @param password The plaintext password.
	 * @return The associate with matching credentials, or null if none match.
	 * @apiNote Ches hates everything about the plaintext password.
	 */
	Associate authenticateAssociate(String username, String password);

	Associate getTopAssociate();

	/**
	 * Return all associates above a given point value.
	 * 
	 * @param pointValue The minimum point value.
	 * @return The set of associates with points above the given value.
	 */
	Set<Associate> getAssociatesAbovePointValue(int pointValue);

	/**
	 * Return all associates.
	 * 
	 * @return The set of all the associates.
	 */
	Set<Associate> getAllAssociates();

	/**
	 * Return all the associates that have a trainer with the given trainer ID.
	 * 
	 * @param id The trainer ID.
	 * @return The set of associates for the specified trainer.
	 */
	Set<Associate> getAllAssociatesByTrainerId(int id);

	/**
	 * Update the given associate and return it.
	 * 
	 * @param associate The associate to update.
	 * @return The newly updated associate.
	 */
	Associate updateAssociate(Associate associate);

	/**
	 * Delete the supplied associate.
	 * 
	 * @param associate The associate to delete.
	 * @return True on success, false if there was a problem.
	 */
	boolean deleteAssociate(Associate associate);
}
