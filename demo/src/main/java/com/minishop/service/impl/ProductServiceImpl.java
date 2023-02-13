package com.minishop.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minishop.convert.ProductConvert;
import com.minishop.dto.ProductDto;
import com.minishop.entity.Product;
import com.minishop.repository.ProductRepository;
import com.minishop.service.ProductService;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductConvert productConvert;

	@Override
	public List<ProductDto> listProducts() {
		List<ProductDto> result = new ArrayList<>();
		List<Product> products = productRepository.findAll();

		for (Product product : products) {
			ProductDto dto = productConvert.toDto(product);
			result.add(dto);
		}

		return result;
	}
}
