package com.SpringBootJpa.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringBootJpa.Application.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
	@Query("SELECT category_id FROM Category WHERE name=?1")
	int findCategoryIdByCategoryName(String name);
	
	
}
