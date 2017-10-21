package com.vampiroTech.service;

import java.util.List;

import com.vampiroTech.model.Goal;

public interface GoalService {
	
	Goal save(Goal goal);

	List<Goal> findAllGoals();

}
