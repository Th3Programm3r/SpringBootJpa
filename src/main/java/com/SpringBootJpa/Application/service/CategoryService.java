package com.SpringBootJpa.Application.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SpringBootJpa.Application.entity.Category;
import com.SpringBootJpa.Application.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {
	
	private final CategoryRepository categoryRepository;
	
	
	public String getCategoryName(int id){
		Optional <Category> returnedCategory=categoryRepository.findById(id);
		if(returnedCategory.isPresent()) {
			return returnedCategory.get().getName();
		}
		return "No category found with that id"; 
	}
	
	public String addCategory(Category category) {
		categoryRepository.save(category);
		return "Category added";
	}

	public String deleteCategory(int id) {
		categoryRepository.deleteById(id);
		return "Category deleted";
	}
	
	public int getCategoryId(String name){
		return categoryRepository.findCategoryIdByCategoryName(name);
	}
	
}
