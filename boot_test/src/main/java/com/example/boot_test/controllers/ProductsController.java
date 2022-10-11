package com.example.boot_test.controllers;

import com.example.boot_test.model.Product;
import com.example.boot_test.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {
	private final ProductService productService;

	public ProductsController(
			ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/products")
	public String viewProducts(Model model) {
		var products = productService.findAll();
		model.addAttribute("products", products);

		return "products.html";
	}

	@PostMapping(path = "/products")
	public String addProduct(
//			Product p, //закоментировать следующие две строки
			@RequestParam String name,
			@RequestParam double price,
			Model model
	) {
//		productService.addProduct(p); //закоментировать следующие 4 строки
		Product p = new Product();
		p.setName(name);
		p.setPrice(price);
		productService.addProduct(p);

		var products = productService.findAll();
		model.addAttribute("products", products);

		return "products.html";
	}
}
