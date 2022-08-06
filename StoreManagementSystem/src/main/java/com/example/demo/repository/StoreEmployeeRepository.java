package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StoreEmployee;

public interface StoreEmployeeRepository extends JpaRepository<StoreEmployee, Integer> {

}
