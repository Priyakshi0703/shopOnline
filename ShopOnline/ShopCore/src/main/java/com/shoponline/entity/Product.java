package com.shoponline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productsdetails")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productid")
	private Long productId;

	@Column(name = "productname")
	private String productName;

	@Column(name = "cost")
	private float cost;

	/*
	 * public Product() {
	 * 
	 * }
	 */
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

}
