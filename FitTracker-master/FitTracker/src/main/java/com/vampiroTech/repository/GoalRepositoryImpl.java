package com.vampiroTech.repository;

import org.springframework.stereotype.Repository;


import com.vampiroTech.model.Goal;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	
	@PersistenceContext
	private EntityManager em;
	
	public Goal save(Goal goal) {
		
		em.persist(goal);
		
		return goal;
	}

}
