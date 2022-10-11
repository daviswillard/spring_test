package com.example.boot_test.service;

import com.example.boot_test.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//Упрощенная структура, созданная, чтобы сосредоточиться на HTTP-методах
// (потоконебезопасная)
@Service
public class ProductService {
	private List<Product> products = new ArrayList<>();

	public void addProduct(Product prod) {
		products.add(prod);
	}

	public List<Product> findAll() {
		return products;
	}
}
