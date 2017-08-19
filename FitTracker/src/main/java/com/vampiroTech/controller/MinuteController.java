package com.vampiroTech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vampiroTech.model.Activity;
import com.vampiroTech.model.Exercise;
import com.vampiroTech.service.ExerciseService;

@Controller
public class MinuteController {
	
	@Autowired
	private ExerciseService exerciseService;
	
	
	@RequestMapping(value= "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		
		System.out.println("exercise" + exercise.getMinutes());
		System.out.println("exercise activity" + exercise.getActivity());
		
		return "addMinutes";
	}
	
	@RequestMapping(value="/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		
		
		
		return exerciseService.findAllActivities();
	}
	

}
