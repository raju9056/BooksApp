package com.rakuten.training.dal;

import java.util.List;

import domain.Product;

public interface ProductDAO {
	Product save(Product toBeSaved);
	Product findById(int id);
	List<Product> findAll();
	void deleteById(int id);
}

