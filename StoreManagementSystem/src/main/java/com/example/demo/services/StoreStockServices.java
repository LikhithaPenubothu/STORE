package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.StoreStock;

public interface StoreStockServices {
		
	    List<StoreStock> getProducts();
		
		Optional<StoreStock> getProduct(int products_id);
		
		StoreStock addProducts(StoreStock storeStock);
		
		StoreStock updateProducts(StoreStock storeStock);

		void deleteProducts(int products_id);

	}


