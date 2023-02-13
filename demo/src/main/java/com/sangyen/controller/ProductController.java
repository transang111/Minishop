package com.sangyen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sangyen.entity.Product;
import com.sangyen.service.ProductService;

@Controller
public class ProductController {
   
	@Autowired
	ProductService productService;
	
	@GetMapping("/")
	public String listProduct(ModelMap modelMap) {
		List<Product> listproduct=productService.listProduct();
		modelMap.addAttribute("product", listproduct);
		return "index";
	}
	
}
