package com.revature.repositories;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.revature.entities.Trainer;

@Component
@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
	Set<Trainer> findByLName(String name);
}
