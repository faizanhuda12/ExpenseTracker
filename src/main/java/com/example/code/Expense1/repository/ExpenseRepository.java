package com.example.code.Expense1.repository;
 

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.code.Expense1.model.Expense;
 

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}