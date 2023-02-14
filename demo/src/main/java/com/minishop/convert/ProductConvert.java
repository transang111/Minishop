package com.minishop.convert;

import org.springframework.stereotype.Component;

import com.minishop.dto.ProductDto;
import com.minishop.entity.Product;

@Component
public class ProductConvert {

	public ProductDto toDto(Product product) {
		ProductDto dto = new ProductDto();
		dto.setId(product.getId());
		dto.setName(product.getName());
		dto.setImage(product.getImage());
		dto.setPrice(product.getPrice());
		dto.setFors(product.getFors());
		return dto;
	}
}
