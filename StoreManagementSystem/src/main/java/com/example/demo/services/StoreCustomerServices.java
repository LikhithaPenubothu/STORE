package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.StoreCustomer;

public interface StoreCustomerServices {
	
    List<StoreCustomer> getProducts();
	
	Optional<StoreCustomer> getProduct(int customer_id);
	
	StoreCustomer addProducts(StoreCustomer storeCustomer);
	
	StoreCustomer updateProducts(StoreCustomer storeCustomer);

	void deleteProducts(int customer_id);

}
