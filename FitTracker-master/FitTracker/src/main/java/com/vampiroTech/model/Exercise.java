package com.vampiroTech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

	@NotNull
	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

}
