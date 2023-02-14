package com.minishop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.minishop.service.ProductService;

@Controller
public class DashboardController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/dashboard")
	public String Dashboard(ModelMap modelMap) {
		modelMap.addAttribute("listproducts", productService.listProducts());
		
		return "dashboard";
	}

}
