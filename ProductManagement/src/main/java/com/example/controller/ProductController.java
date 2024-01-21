package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public ResponseEntity<Product> createProductHandler(@RequestBody Product product){
		Product savedProduct = productService.createProduct(product);
		
		return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	}
	
	@GetMapping("/{Id}")
	public ResponseEntity<Product> getProductHandler(@PathVariable Integer Id){
		Product existingProduct = productService.getProductById(Id);
		
		return new ResponseEntity<>(existingProduct, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> getAllProductsHandler(){
		return new ResponseEntity<List<Product>>(productService.getAllProducts(), HttpStatus.OK);
	}
	
	@PutMapping("/{Id}")
	public  ResponseEntity<Product> updateProductHandler(@PathVariable Integer Id, @RequestBody Product updatedProduct){
		Product existingProduct = productService.updateProduct(Id, updatedProduct);
		
		return new ResponseEntity<Product>(existingProduct, HttpStatus.OK);
	}
	
	@DeleteMapping("/{Id}")
	public ResponseEntity<Product> deleteProductHandler(@PathVariable Integer Id){
		
		Product deletedProduct = productService.deleteProductById(Id);
		
		return new ResponseEntity<Product>(deletedProduct, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
