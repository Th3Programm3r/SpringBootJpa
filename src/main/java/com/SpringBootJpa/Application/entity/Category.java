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
@Table(name="category")
public class Category {
	@Id
	private int category_id;
	private String name;
}
