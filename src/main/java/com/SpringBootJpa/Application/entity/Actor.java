package com.SpringBootJpa.Application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="actor")
public class Actor {
	@Id
	private int actor_id;
	private String first_name;
	private String last_name;
	
}
