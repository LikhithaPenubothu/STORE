package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StoreCustomer;

public interface StoreCustomerRepository extends JpaRepository<StoreCustomer, Integer> {

}