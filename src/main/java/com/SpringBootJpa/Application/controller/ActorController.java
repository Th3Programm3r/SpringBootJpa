package com.SpringBootJpa.Application.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootJpa.Application.entity.Actor;
import com.SpringBootJpa.Application.service.ActorService;


@RestController
@RequestMapping("/actors")
public class ActorController {
	@Autowired
	ActorService actorService;


	@PostMapping
	public String addActor(@RequestBody Actor actor) {
		return actorService.addActor(actor);
	}

	@GetMapping
	public List<Actor> getActors() {	
		return actorService.getActors();
	}
	
	@GetMapping("/{id}")
	public Actor getActor(@PathVariable int id) {
		return actorService.getActor(id);
	}

	@DeleteMapping("/{id}")
	public String deleteActor(@PathVariable int id) {
		return actorService.deleteActor(id);
	}
}