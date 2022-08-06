package com.example.demo.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="employees")

public class StoreEmployee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="emp_id")
	private int emp_id;
	
	@Column(name="emp_name")
	private String emp_name;
	
	@Column(name="working_field")
	private String working_field;
	
	@Column(name="salary")
	private float salary;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone_no")
	private BigInteger phone_no;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getWorking_field() {
		return working_field;
	}

	public void setWorking_field(String working_field) {
		this.working_field = working_field;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigInteger getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(BigInteger phone_no) {
		this.phone_no = phone_no;
	}
	
	
}
	