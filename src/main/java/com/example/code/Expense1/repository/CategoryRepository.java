package com.example.code.Expense1.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.code.Expense1.model.Category;

 

public interface CategoryRepository  extends JpaRepository<Category, Long>{
	Category findByName(String name);
}