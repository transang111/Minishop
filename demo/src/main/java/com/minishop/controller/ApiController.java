package com.minishop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.minishop.service.ProductService;

@RestController
public class ApiController {
	
	@Autowired
	private ProductService productService;
	
	@DeleteMapping("removeProduct/{id}")
    public void deleteProduct(@PathVariable int id ) {
 	    productService.deleteProduct(id);
    }
}
