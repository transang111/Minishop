package com.sangyen.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangyen.Repository.ProductRepository;
import com.sangyen.entity.Product;

@Service
public class ProductService {
    @Autowired
	ProductRepository productRepository;
    
    public List<Product> listProduct(){
    	List<Product> list= productRepository.findAll();
    	return list;
    }
}
