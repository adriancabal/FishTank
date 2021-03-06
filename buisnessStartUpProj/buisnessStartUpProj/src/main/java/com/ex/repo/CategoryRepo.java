package com.ex.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.domain.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	Category findById(Integer id);
}
