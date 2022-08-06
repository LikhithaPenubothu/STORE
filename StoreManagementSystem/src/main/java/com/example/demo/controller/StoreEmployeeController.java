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

import com.example.demo.model.StoreEmployee;
import com.example.demo.services.StoreEmployeeImplementation;

@RestController
public class StoreEmployeeController {
	@Autowired
	private StoreEmployeeImplementation storeEmployeeService;
	
	@GetMapping("/StoreEmployee")
	public List<StoreEmployee> getProducts() {
		return storeEmployeeService.getProducts();
	}
	@GetMapping("/StoreEmployee/{emp_id}")
	public Optional<StoreEmployee> getProduct(@PathVariable int emp_id) {
		return storeEmployeeService.getProduct(emp_id);
	}
	@PostMapping("/StoreEmployee")
	public StoreEmployee addProducts(@RequestBody StoreEmployee storeEmployee) {
		return storeEmployeeService.addProducts(storeEmployee);
	}
	@PutMapping("/StoreEmployee/{emp_id}")
	public StoreEmployee updateProducts(@RequestBody StoreEmployee storeEmployee,@PathVariable int emp_id) {
		storeEmployee.setEmp_id(emp_id);
		return storeEmployeeService.updateProducts(storeEmployee);
	}
	@DeleteMapping("/StoreEmployee")
	public void deleteProducts(@RequestParam int emp_id) {
		storeEmployeeService.deleteProducts(emp_id);
	}
	
	
	

}
