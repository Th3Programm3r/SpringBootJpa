package com.SpringBootJpa.Application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SpringBootJpa.Application.entity.Actor;
import com.SpringBootJpa.Application.repository.ActorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ActorService {
	private final ActorRepository actorRepository;
	
	public String addActor(Actor actor) {
		actorRepository.save(actor);
		return "Actor Added";
	}
	public List<Actor> getActors() {
		List<Actor> lista = actorRepository.findAll();
		return lista;
	}
	public Actor getActor(int id) {
		Optional<Actor>actor=actorRepository.findById(id);
		if(actor.isPresent()) {
			return actor.get();
		}
		return new Actor();
		
	}
	public String deleteActor(int id) {
		actorRepository.deleteById(id);
		return "User deleted";
	}
}
