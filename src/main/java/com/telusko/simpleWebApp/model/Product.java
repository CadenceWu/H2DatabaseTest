package com.telusko.simpleWebApp.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {
	
	@Id  //Primary key
	private int proId;
	private String proName;
	private int price;
	
	
	public Product() {

	}

	public Product(int proId, String proName, int price) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.price = price;
	}


	public int getProId() {
		return proId;
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", price=" + price + "]";
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



}
