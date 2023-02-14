package com.minishop.service;

import java.util.List;

import com.minishop.dto.ProductDto;

public interface ProductService {
	/**
	 * get list product.
	 * @return List<ProductDto>
	 */
	List<ProductDto> listProducts();

	/**
	 * delete product by id.
	 * @param id
	 */
	void deleteProduct(int id);
}
