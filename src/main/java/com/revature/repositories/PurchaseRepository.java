package com.revature.repositories;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.revature.entities.Purchase;

@Component
@Repository
public interface PurchaseRepository extends CrudRepository<Purchase, Integer>{
	Set<Purchase> findByAssociateId(int id);
}
