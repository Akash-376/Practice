package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.exception.ProductNotFoundException;
import com.example.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product getProductById(Integer id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Product not found with this Id"));
	}

	@Override
	public List<Product> getAllProducts() throws ProductNotFoundException {
		// TODO Auto-generated method stub
		List<Product> productList = productRepository.findAll();
		if(productList.isEmpty()) throw new ProductNotFoundException("Product not found");
		return productList;
	}

	@Override
	public Product updateProduct(Integer id, Product updatedProduct) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		Product ExistingProd = getProductById(id);
		ExistingProd.setName(updatedProduct.getName());
		ExistingProd.setPrice(updatedProduct.getPrice());
		ExistingProd.setDescription(updatedProduct.getDescription());
		productRepository.save(ExistingProd);
		return updatedProduct;
	}

	@Override
	public Product deleteProductById(Integer id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		Product ExistingProd = getProductById(id);
		productRepository.delete(ExistingProd);
		return ExistingProd;
	}

    
}
