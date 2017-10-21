package com.vampiroTech.repository;

import java.util.List;

import com.vampiroTech.model.Goal;

public interface GoalRepository {
	
	Goal save(Goal goal);

	List<Goal> loadAll();

}
