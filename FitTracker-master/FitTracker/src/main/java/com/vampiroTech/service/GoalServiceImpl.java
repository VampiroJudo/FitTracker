package com.vampiroTech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vampiroTech.model.Goal;
import com.vampiroTech.model.GoalReport;
import com.vampiroTech.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {


		
		@Autowired 
		private GoalRepository goalRepository;
		
		@Transactional
		public Goal save(Goal goal) {
			return goalRepository.save(goal);
		}

		@Override
		public List<Goal> findAllGoals() {
			return goalRepository.loadAll();
		}

		@Override
		public List<GoalReport> findAllGoalReports() {
			return goalRepository.findAllGoalReports();
		}
}
