package com.vampiroTech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Exercise {
	
	@Id
	@GeneratedValue
	private Long Id;
	
	
	@Range(min = 1, max = 120)
	private int minutes;

	private String activity;
    
	
	@ManyToOne
	private Goal goal;
	
	public String getActivity() {
		return activity;
	}

	public Goal getGoal() {
		return goal;
	}
	
	public Long getId() {
		return Id;
	}

	@NotNull
	public int getMinutes() {
		return minutes;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}
