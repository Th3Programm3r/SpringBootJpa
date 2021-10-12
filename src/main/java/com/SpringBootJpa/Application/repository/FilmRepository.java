package com.SpringBootJpa.Application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringBootJpa.Application.entity.Film;

public interface FilmRepository extends JpaRepository<Film, Integer>{

	Film findByTitle(String title);
	List<Film> findByRating(String rating);
	@Query("SELECT f FROM Film f WHERE f.category_id=?1")
	List<Film> findFilmByCategory(int categoryId);
	

	
}
