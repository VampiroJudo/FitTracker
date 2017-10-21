package com.vampiroTech.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.vampiroTech.model.Goal;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	
	@PersistenceContext
	private EntityManager em;
	
	public Goal save(Goal goal) {
		
		em.persist(goal);
		
		em.flush();
		
		return goal;
	}

	@SuppressWarnings("rawtypes")
	public List<Goal> loadAll() {
		Query query = em.createQuery("Select g from Goal g");
		
		List goals = query.getResultList();
		
		return goals;
	}

}
