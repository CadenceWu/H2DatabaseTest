package com.telusko.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;

//So the object can be created in the spring container
@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
//	List<Product> products = new ArrayList<>(Arrays.asList(
//			new Product(101, "Iphone", 50000), 
//			new Product(102, "Canon Camara", 70000),
//			new Product(103, "Shure Mic", 30000)));

	public List<Product> getProducts() {
		return repo.findAll();
	}

	public Product getProductById(int prodId) {

		return repo.findById(prodId).orElse(new Product());
	}

	public void addProduct(Product prod) {
		repo.save(prod);

	}

	public void updateProduct(Product prod) {
		repo.save(prod);
	}

	public void deleteProduct(int prodId) {
		repo.deleteById(prodId);
		
	}

}
