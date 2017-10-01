package com.vampiroTech.service;

import java.util.List;

import com.vampiroTech.model.Activity;
import com.vampiroTech.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}