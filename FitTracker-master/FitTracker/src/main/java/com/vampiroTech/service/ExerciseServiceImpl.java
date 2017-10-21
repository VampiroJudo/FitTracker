package com.vampiroTech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vampiroTech.model.Activity;
import com.vampiroTech.model.Exercise;
import com.vampiroTech.repository.ExerciseRepository;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {
	
	@Autowired
	private ExerciseRepository exerciseRepository;
	
	public List<Activity> findAllActivites() {
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		run.setDesc("Bike");
		
		activities.add(bike);
		
		Activity swim = new Activity();
		run.setDesc("Swim");
		activities.add(swim);
		
		Activity gym = new Activity();
		run.setDesc("Gym");
		activities.add(gym);
		
		Activity bodyWeight = new Activity();
		run.setDesc("Body Weight");
		activities.add(bodyWeight);
		
		return activities;
		
		
	}


	@Transactional
	public Exercise save(Exercise exercise) {
		
		exercise = exerciseRepository.save(exercise);
		
		
		return exercise;
	}


	@Override
	public List<Activity> findAllActivities() {
		return null;
	}


	
}
