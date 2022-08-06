package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name="stock")

public class StoreStock {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="products_id")
	private int products_id;
	
	@Column(name="product_name")
	private String product_name;
	
	@Column(name="product_type")
	private String product_type;
	
	@Column(name="product_price")
	private float product_price;
	
	@Column(name="product_quantity")
	private float product_quantity;

	public int getProducts_id() {
		return products_id;
	}

	public void setProducts_id(int products_id) {
		this.products_id = products_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public float getProduct_price() {
		return product_price;
	}

	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}

	public float getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(float product_quantity) {
		this.product_quantity = product_quantity;
	}
	
	

}
