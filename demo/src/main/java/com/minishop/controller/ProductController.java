package com.minishop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.minishop.dto.ProductDto;
import com.minishop.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/")
	public String listProducts(ModelMap modelMap) {
		List<ProductDto> products = productService.listProducts();
		modelMap.addAttribute("product", products);

		return "index";
	}

}
