package com.SpringBootJpa.Application.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootJpa.Application.entity.Actor;
import com.SpringBootJpa.Application.entity.Film;
import com.SpringBootJpa.Application.entity.FilmActor;
import com.SpringBootJpa.Application.service.FilmActorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/filmActors")
public class FilmActorController{
	private final FilmActorService filmActorService;

	@PostMapping	
	public void addFilmActor(@RequestBody FilmActor filmActor){	
		filmActorService.addFilmActor(filmActor);
	}
	@GetMapping
	public List<FilmActor> getAllFilmActor(){	
		return filmActorService.getAllFilmActor();
	}
	
	
	@GetMapping("/find-actor/{filmId}")
	public List<Actor> findActorMovie(@PathVariable int filmId) {
		return filmActorService.findActorMovie(filmId);
	}
	@GetMapping("/find-film/{actorId}")
	public List<Film> findMovieActor(@PathVariable int actorId) {
		return filmActorService.findMovieActor(actorId);
	}
	
}
