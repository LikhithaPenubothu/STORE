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
@Table(name="Customers")

public class StoreCustomer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="customer_id")
	private int customer_id;
	
	@Column(name="customer_name")
	private String customer_name;
	
	@Column(name="products_brought")
	private String products_brought;
	
	@Column(name="billing_desk_no")
	private int billing_desk_no;
	
	@Column(name="phone_no")
	private BigInteger phone_no;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getProducts_brought() {
		return products_brought;
	}

	public void setProducts_brought(String products_brought) {
		this.products_brought = products_brought;
	}

	public int getBilling_desk_no() {
		return billing_desk_no;
	}

	public void setBilling_desk_no(int billing_desk_no) {
		this.billing_desk_no = billing_desk_no;
	}

	public BigInteger getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(BigInteger phone_no) {
		this.phone_no = phone_no;
	}
	
	
}