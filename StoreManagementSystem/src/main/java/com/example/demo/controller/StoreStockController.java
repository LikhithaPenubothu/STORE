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

import com.example.demo.model.StoreStock;
import com.example.demo.services.StoreStockImplementation;

@RestController
public class StoreStockController {
	@Autowired
	private StoreStockImplementation storeStockService;
	
	@GetMapping("/StoreStock")
	public List<StoreStock> getProducts() {
		return storeStockService.getProducts();
	}
	@GetMapping("/StoreStock/{products_id}")
	public Optional<StoreStock> getProduct(@PathVariable int products_id) {
		return storeStockService.getProduct(products_id);
	}
	@PostMapping("/StoreStock")
	public StoreStock addProducts(@RequestBody StoreStock storeStock) {
		return storeStockService.addProducts(storeStock);
	}
	@PutMapping("/StoreStock/{products_id}")
	public StoreStock updateProducts(@RequestBody StoreStock storeStock,@PathVariable int products_id) {
		storeStock.setProducts_id(products_id);
		return storeStockService.updateProducts(storeStock);
	}
	@DeleteMapping("/StoreStock")
	public void deleteProducts(@RequestParam int products_id) {
		storeStockService.deleteProducts(products_id);
	}
	
	
	

}
