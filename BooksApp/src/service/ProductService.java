package com.rakuten.training.service;

import java.util.List;

import domain.Product;

public interface ProductService {
	int addNewProduct(Product tobeAdded);
	void removeProduct(int id);
	List<Product> findAll();
	Product findById(int id);
}
