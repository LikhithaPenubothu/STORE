package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StoreCustomer;
import com.example.demo.services.StoreCustomerImplementation;

@RestController
public class StoreCustomerController {
	@Autowired
	private StoreCustomerImplementation storeCustomerService;
	
	@GetMapping("/StoreCustomer")
	public List<StoreCustomer> getProducts() {
		return storeCustomerService.getProducts();
	}
	@GetMapping("/StoreCustomer/{customer_id}")
	public Optional<StoreCustomer> getProduct(@PathVariable int customer_id) {
		return storeCustomerService.getProduct(customer_id);
	}
	@PostMapping("/StoreCustomer")
	public StoreCustomer addProducts(@RequestBody StoreCustomer storeCustomer) {
		return storeCustomerService.addProducts(storeCustomer);
	}
	@PutMapping("/StoreCustomer/{customer_id}")
	public StoreCustomer updateProducts(@RequestBody StoreCustomer storeCustomer,@PathVariable int customer_id) {
		storeCustomer.setCustomer_id(customer_id);
		return storeCustomerService.updateProducts(storeCustomer);
	}
	@DeleteMapping("/StoreCustomer")
	public void deleteProducts(@RequestParam int customer_id) {
		storeCustomerService.deleteProducts(customer_id);
	}
	
	
	

}
