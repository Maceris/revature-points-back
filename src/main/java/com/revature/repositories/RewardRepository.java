package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.revature.entities.Reward;

@Component
@Repository
public interface RewardRepository extends CrudRepository<Reward, Integer>{

}
