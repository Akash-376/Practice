package com.example.service;

import java.util.List;

import com.example.entity.Product;
import com.example.exception.ProductNotFoundException;

public interface ProductService {
	
	public Product createProduct(Product product);
	public Product getProductById(Integer id) throws ProductNotFoundException;
	public List<Product> getAllProducts() throws ProductNotFoundException;
	public Product updateProduct(Integer id, Product updatedProduct) throws ProductNotFoundException;
	public Product deleteProductById(Integer id) throws ProductNotFoundException;
}
