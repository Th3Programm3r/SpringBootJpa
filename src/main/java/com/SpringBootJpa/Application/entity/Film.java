package com.SpringBootJpa.Application.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="film")
public class Film {
	@Id
	private int film_id;
	private String title;
	private int category_id;
	private String description;
	private int length;
	private String rating;
}
