package com.revature.repositories;

import com.revature.entities.Purchase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * A CRUD repository for purchases, to be implemented by Spring.
 */
@Component
@Repository
public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {
	/**
	 * Finds all purchases that were made by an associate with the supplied
	 * associate ID.
	 *
	 * @param id The associate ID to look for.
	 * @return The set of purchases made by the given associate.
	 */
	Set<Purchase> findByAssociateId(int id);
}
