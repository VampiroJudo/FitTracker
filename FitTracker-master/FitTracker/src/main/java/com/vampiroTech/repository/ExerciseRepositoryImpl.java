package com.vampiroTech.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.vampiroTech.model.Exercise;

@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {

	@PersistenceContext
	private EntityManager em;

	
	public Exercise save(Exercise exercise) {
		
		em.persist(exercise);
		
		em.flush();

		return exercise;
	}

}
