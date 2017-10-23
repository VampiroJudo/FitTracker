package com.vampiroTech.repository;

import java.util.List;

import com.vampiroTech.model.Goal;
import com.vampiroTech.model.GoalReport;

public interface GoalRepository {
	
	Goal save(Goal goal);

	List<Goal> loadAll();

	List<GoalReport> findAllGoalReports();

}
