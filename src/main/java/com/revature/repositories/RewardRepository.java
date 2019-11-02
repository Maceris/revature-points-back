package com.revature.repositories;

import com.revature.entities.Reward;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * A CRUD repository for rewards, to be implemented by Spring.
 */
@Component
@Repository
public interface RewardRepository extends CrudRepository<Reward, Integer> {

}
