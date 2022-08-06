package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StoreStock;


public interface StoreStockRepository extends JpaRepository<StoreStock, Integer> {

	
}
