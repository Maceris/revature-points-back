package com.revature.repositories;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.revature.entities.Associate;

@Component
@Repository
public interface AssociateRepository extends CrudRepository<Associate, Integer>{
	Set<Associate> findByUsername(String username);
	Set<Associate> findByLName(String name);
	Set<Associate> findByTrainerId(int id);
}
