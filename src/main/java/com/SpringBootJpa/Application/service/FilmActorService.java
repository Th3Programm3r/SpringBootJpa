package com.SpringBootJpa.Application.service;


import java.util.LinkedList;
import java.util.List;



import org.springframework.stereotype.Service;

import com.SpringBootJpa.Application.entity.Actor;
import com.SpringBootJpa.Application.entity.Film;
import com.SpringBootJpa.Application.entity.FilmActor;
import com.SpringBootJpa.Application.repository.FilmActorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FilmActorService {
	private final FilmActorRepository filmActorRepository;
	private final ActorService actorService;
	private final FilmService filmService;
	
	public void addFilmActor(FilmActor filmActor){	
		filmActorRepository.save(filmActor);
	}

	public List<FilmActor> getAllFilmActor() {
		return filmActorRepository.findAll() ;
	}
	
	//Function that receives a filmId and returns the actors which participates in the movie with that film_id
	public List<Actor> findActorMovie(int filmId) {
		List<Integer> listActorId=filmActorRepository.findActorIdByFilmId(filmId);
		LinkedList<Actor> listActor=new LinkedList<Actor>();
		for(int id:listActorId) {
			listActor.add(actorService.getActor(id));
		}
		return listActor;
	}
	//Function that receives a filmId and returns the actors which participates in the movie with that film_id
	public List<Film> findMovieActor(int actorId) {
		List<Integer> listFilmId=filmActorRepository.findFilmIdByActorId(actorId);
		LinkedList<Film> listFilm=new LinkedList<Film>();
		for(int id:listFilmId) {
			listFilm.add(filmService.findMovieById(id));
		}
		return listFilm;
	}
}
