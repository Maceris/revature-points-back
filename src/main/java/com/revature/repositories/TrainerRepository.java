package com.revature.repositories;

import com.revature.entities.Trainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * A CRUD repository for trainers, to be implemented by Spring.
 */
@Component
@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
	/**
	 * Find the trainer that has the supplied username.
	 *
	 * @param username The username to look for.
	 * @return The trainer with the given username, or null if none are found.
	 */
	Trainer findByUsername(String username);
	// TODO Set<Trainer> findByLName(String name);
}
