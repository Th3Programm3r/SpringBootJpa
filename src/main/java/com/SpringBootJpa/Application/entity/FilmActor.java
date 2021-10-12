package com.SpringBootJpa.Application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="film_actor")
@IdClass(FilmActorId.class)
public class FilmActor {
	@Id
	private int actor_id;
	@Id
	private int film_id;
	
}
