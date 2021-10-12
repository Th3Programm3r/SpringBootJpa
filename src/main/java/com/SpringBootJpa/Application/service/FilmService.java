package com.SpringBootJpa.Application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SpringBootJpa.Application.entity.Film;
import com.SpringBootJpa.Application.repository.FilmRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FilmService {
	private final FilmRepository filmRepository;
	private final CategoryService categoryService;
	
	public String addFilm(Film film) {
		filmRepository.save(film);
		return "film added";
	}
	
	
	public Film findMovieById(int id) {
		Optional<Film> film=filmRepository.findById(id);
		if(film.isPresent()) {
			return film.get();
		}
		return new Film();
	}
	
	
	//find movies with a certain title
	public Film findMovieByTitle(String title) {		
		return filmRepository.findByTitle(title);
	}
	//find movies with certain rating
	public List<Film> findMovieByRating(String rating) {		
		return filmRepository.findByRating(rating);
	}
	
	//find movies given a category name
	public List<Film> findMovieByCategoryName(String categoryName) {		
		int categoryId=categoryService.getCategoryId(categoryName);
		return filmRepository.findFilmByCategory(categoryId);
	}
	
	//returns length of the movie with film_id=id
	public int findLength(int id) {
		Optional<Film> query= filmRepository.findById(id);
		if(query.isPresent()) 
			return query.get().getLength();
		else 
			return 0;
	}

}
