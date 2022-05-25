package com.sutanrrier.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sutanrrier.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
}
