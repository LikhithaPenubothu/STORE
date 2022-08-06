package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StoreStock;
import com.example.demo.repository.StoreStockRepository;

@Service
public class StoreStockImplementation implements StoreStockServices {
	
	@Autowired
	private StoreStockRepository storeStockRepository;
	
	@Override
	public List<StoreStock> getProducts(){
		return storeStockRepository.findAll();
	}

	@Override
	public Optional<StoreStock> getProduct(int products_id) {
		System.out.println("Inside");
		Optional<StoreStock> optionaldata=storeStockRepository.findById(products_id);
		return optionaldata;
	}

	@Override
	public StoreStock addProducts(StoreStock storeStock) {
		
		return storeStockRepository.save(storeStock);
	}

	@Override
	public StoreStock updateProducts(StoreStock storeStock) {
		
		return storeStockRepository.save(storeStock);
	}

	@Override
	public void deleteProducts(int products_id) {
		storeStockRepository.deleteById(products_id);
	}
	}
	
    