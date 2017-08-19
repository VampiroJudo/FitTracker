package com.vampiroTech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vampiroTech.model.Activity;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {
	
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
		
		return activities;
		
		
	}

	public List<Activity> findAllActivities() {
		// TODO Auto-generated method stub
		return null;
	}

}
