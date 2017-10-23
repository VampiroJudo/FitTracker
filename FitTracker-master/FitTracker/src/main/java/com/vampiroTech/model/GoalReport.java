package com.vampiroTech.model;

public class GoalReport {
	
	private int goalMinutes;
	public int getGoalMinutes() {
		return goalMinutes;
	}
	public void setGoalMinutes(int goalMinutes) {
		this.goalMinutes = goalMinutes;
	}
	public int getExerciseMinutes() {
		return exerciseMinutes;
	}
	public void setExerciseMinutes(int exerciseMinutes) {
		this.exerciseMinutes = exerciseMinutes;
	}
	public String getExerciseActivity() {
		return exerciseActivity;
	}
	public void setExerciseActivity(String exerciseActivity) {
		this.exerciseActivity = exerciseActivity;
	}
	private int exerciseMinutes;
	private String exerciseActivity;
	

}
