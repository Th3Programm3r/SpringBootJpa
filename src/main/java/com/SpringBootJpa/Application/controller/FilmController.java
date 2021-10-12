package com.SpringBootJpa.Application.controller;

import java.util.List;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootJpa.Application.entity.Film;
import com.SpringBootJpa.Application.service.FilmService;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
@RequestMapping("/films")
public class FilmController {

	private final FilmService filmService;

	@PostMapping
	public String addFilm(@RequestBody Film film) {
		return filmService.addFilm(film);
	}
	
	@GetMapping("/{id}")
	public Film findMovieById(@PathVariable int id) {
		return filmService.findMovieById(id);
	}
	
	@GetMapping(path="/title/{title}")
	//find movies with a certain title
	public Film findMovieByTitle(@PathVariable String title) {		
		return filmService.findMovieByTitle(title);
	}
	@GetMapping(path="/rating/{rating}")
	//find movies with certain rating
	public List<Film> findMovieByRating(@PathVariable String rating) {		
		return filmService.findMovieByRating(rating);
	}
	
	@GetMapping(path="/category-name/{categoryName}")
	//find movies given a category name
	public List<Film> findMovieByCategoryName(@PathVariable String categoryName) {		
		return filmService.findMovieByCategoryName(categoryName);
	}
	
	@GetMapping("/length/{id}")
	//returns length of the movie with film_id=id
	public int findLength(@PathVariable int id) {
		return filmService.findLength(id);
	}
	
	
	
}
