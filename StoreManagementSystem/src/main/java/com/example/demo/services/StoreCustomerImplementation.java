package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StoreCustomer;
import com.example.demo.repository.StoreCustomerRepository;


@Service
public class StoreCustomerImplementation implements StoreCustomerServices {
	
	@Autowired
	private StoreCustomerRepository storeCustomerRepository;
	
    @Override
	public
	List<StoreCustomer> getProducts() {
		
		return storeCustomerRepository.findAll();
	}
    @Override
    public Optional<StoreCustomer> getProduct(int customer_id){
    	System.out.println("Inside getProduct");
    	Optional<StoreCustomer> optionaldata=storeCustomerRepository.findById(customer_id);
		return optionaldata;
    	
    }
	@Override
	public StoreCustomer addProducts(StoreCustomer storeCustomer) {
		return storeCustomerRepository.save(storeCustomer);
	}
	@Override
	public StoreCustomer updateProducts(StoreCustomer storeCustomer) {
		return storeCustomerRepository.save(storeCustomer);
	}
	@Override
    public void deleteProducts(int customer_id) {
		storeCustomerRepository.deleteById(customer_id);
    }


}
