package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StoreEmployee;
import com.example.demo.repository.StoreEmployeeRepository;


@Service
public class StoreEmployeeImplementation implements StoreEmployeeServices {
	
	@Autowired
	private StoreEmployeeRepository storeEmployeeRepository;
	
    @Override
	public
	List<StoreEmployee> getProducts() {
		
		return storeEmployeeRepository.findAll();
	}
    @Override
    public Optional<StoreEmployee> getProduct(int customer_id){
    	System.out.println("Inside getProduct");
    	Optional<StoreEmployee> optionaldata=storeEmployeeRepository.findById(customer_id);
		return optionaldata;
    	
    }
	@Override
	public StoreEmployee addProducts(StoreEmployee storeEmployee) {
		return storeEmployeeRepository.save(storeEmployee);
	}
	@Override
	public StoreEmployee updateProducts(StoreEmployee storeEmployee) {
		return storeEmployeeRepository.save(storeEmployee);
	}
	@Override
    public void deleteProducts(int customer_id) {
    	storeEmployeeRepository.deleteById(customer_id);
    }


}
