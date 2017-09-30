package com.vampiroTech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vampiroTech.model.Goal;
import com.vampiroTech.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {


		
		@Autowired 
		private GoalRepository goalRepository;
		
		@Transactional
		public Goal save(Goal goal) {
			return goalRepository.save(goal);
		}
}
