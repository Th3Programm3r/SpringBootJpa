package com.SpringBootJpa.Application.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootJpa.Application.entity.Category;
import com.SpringBootJpa.Application.service.CategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController{
	private final CategoryService categoryService;
	
	@GetMapping("/{id}")
	public String getCategoryName(@PathVariable int id){	
		return categoryService.getCategoryName(id); 
	}
	@PostMapping
	public String addCategory(@RequestBody Category category) {
		return categoryService.addCategory(category);
	}
	@DeleteMapping("/{id}")
	public String deleteCategory(@PathVariable int id) {
		return categoryService.deleteCategory(id);
	}
	
	
}
