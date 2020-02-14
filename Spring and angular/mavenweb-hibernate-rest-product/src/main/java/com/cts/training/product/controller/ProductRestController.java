package com.cts.training.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.product.entity.Product;
import com.cts.training.product.exception.ProductNotFoundException;
import com.cts.training.product.services.IProductService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class ProductRestController {
	@Autowired
	private IProductService iProductService;
	
	@GetMapping("/products") // GET HTTP VERB
	public ResponseEntity<List<Product>> exposeAll() {
		
		List<Product> products = this.iProductService.findAllProducts();
		// if(students.size() == 0)
		if(products == null)
			throw new ProductNotFoundException("Not able to fetch records!!!");
		ResponseEntity<List<Product>> response = 
								new ResponseEntity<List<Product>>(products, HttpStatus.OK);
		
		
		return response;
	}
	
	// {<data variable>}
	@GetMapping("/products/{productId}") // GET HTTP VERB
	public ResponseEntity<Product> getById(@PathVariable Integer productId) {
		
		Product product = this.iProductService.findProductById(productId);
		if(product == null)
			throw new ProductNotFoundException("Product with id-" + productId + " not Found");
		
		ResponseEntity<Product> response = 
				new ResponseEntity<Product>(product, HttpStatus.OK);

		return response;
	}
	
	
	@PostMapping("/products") // POST HTTP VERB
	public ResponseEntity<Product> save(@RequestBody Product product) {
		if(!this.iProductService.addProduct(product))
			throw new RuntimeException("Could not add new record!!!");
		ResponseEntity<Product> response = 
				new ResponseEntity<Product>(product, HttpStatus.OK);

		return response;
	}
		
	@PutMapping("/products")
	public ResponseEntity<Product> saveUpdate(@RequestBody Product product) {
		if(!this.iProductService.updateProduct(product))
			throw new RuntimeException("Could not update record!!!");
		ResponseEntity<Product> response = 
				new ResponseEntity<Product>(product, HttpStatus.OK);

		return response;
	}
	
	@DeleteMapping("/products/{productId}")
	public ResponseEntity<Product> delete(@PathVariable Integer productId) {
		
		Product product = this.iProductService.findProductById(productId);
		if(product == null)
			throw new ProductNotFoundException("Product with id-" + productId + " not Found");
		
		// send studentId to DAO via SERVICE
		this.iProductService.deleteProduct(productId);
		
		ResponseEntity<Product> response = 
				new ResponseEntity<Product>(product, HttpStatus.OK);

		return response;
	}
}
