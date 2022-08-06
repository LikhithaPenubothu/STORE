package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.StoreEmployee;

public interface StoreEmployeeServices {
	
    List<StoreEmployee> getProducts();
	
	Optional<StoreEmployee> getProduct(int customer_id);
	
	StoreEmployee addProducts(StoreEmployee storeEmployee);
	
	StoreEmployee updateProducts(StoreEmployee storeEmployee);

	void deleteProducts(int customer_id);

}