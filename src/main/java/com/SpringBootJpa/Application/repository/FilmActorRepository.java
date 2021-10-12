package com.SpringBootJpa.Application.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringBootJpa.Application.entity.FilmActor;

public interface FilmActorRepository extends JpaRepository<FilmActor, Integer>{
	
	@Query("SELECT actor_id FROM FilmActor  WHERE film_id=?1")
	List<Integer> findActorIdByFilmId(int filmId);
	@Query("SELECT film_id FROM FilmActor  WHERE actor_id=?1")
	List<Integer> findFilmIdByActorId(int actorId);
	
}
