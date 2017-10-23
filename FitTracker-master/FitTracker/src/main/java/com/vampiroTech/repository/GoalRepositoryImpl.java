package com.vampiroTech.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.vampiroTech.model.Goal;
import com.vampiroTech.model.GoalReport;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	
	@PersistenceContext
	private EntityManager em;
	
	public Goal save(Goal goal) {
		
		em.persist(goal);
		
		em.flush();
		
		return goal;
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	public List<Goal> loadAll() {
		//Query query = em.createQuery("Select g from Goal g");
		
		TypedQuery<Goal> query = em.createNamedQuery(GOAL.FIND_ALL_GOALS, Goal.class);
		
		//List goals = query.getResultList();
		
		//return goals;
		
		return query.getResultList();
	}

	public List<GoalReport> findAllGoalReports() {
		//Query query = em.createQuery("Select new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) " + 
					//"from Goal g, Exercise e whereg.id = e.goal.id");
		
		TypedQuery<GoalReport>query = em.createNamedQuery(Goal.FIND_GOAL_REPORTS, GoalReport.class);
		
		return query.getResultList();
	}

}
