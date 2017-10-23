package com.vampiroTech.service;

import java.util.List;

import com.vampiroTech.model.Goal;
import com.vampiroTech.model.GoalReport;

public interface GoalService {
	
	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();

}
