package com.vampiroTech.service;

import org.springframework.stereotype.Service;

import com.vampiroTech.model.Goal;
import com.vampiroTech.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	public Goal save(Goal goal) {
		
		@Autowired
		private GoalRepository goalRespository;
		
		return goalRepository.save(goal);
		
		
	}

}
