package com.revature.repositories;

import com.revature.entities.Associate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * A CRUD repository for associates, to be implemented by Spring.
 */
@Component
@Repository
public interface AssociateRepository
	extends CrudRepository<Associate, Integer> {
	/**
	 * Find all associates that have a given username.
	 * 
	 * @param username The username to search for.
	 * @return The set of associates that have that username.
	 */
	Set<Associate> findByUsername(String username);

	// TODO Set<Associate> findByLName(String name);
	/**
	 * Find all associates that have the given trainer, based on the trainers
	 * ID.
	 * 
	 * @param id The trainer ID to look for.
	 * @return The set of associates with the given trainer ID.
	 */
	Set<Associate> findByTrainerId(int id);
}
