package com.telusko.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.service.ProductService;

@RestController
@RequestMapping("/test")
public class ProductController {
	
	@Autowired
	ProductService service;
	

	//Responsible to accept the product
	@GetMapping("/products")
	public List<Product> getProducts() {
		
		return service.getProducts();
	}
	
	@GetMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId) {
		return service.getProductById(prodId);
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prod) { //Sending a body from the client to the server
		System.out.println(prod);
		service.addProduct(prod);
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prod) {
		service.updateProduct(prod);
	}
	
	@DeleteMapping("/products/{prodId}")
	public void deleteProduct(@PathVariable int prodId) {
		service.deleteProduct(prodId);
	}
	
}

