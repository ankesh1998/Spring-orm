package com.spring.test.spingorm.product.dao;

import com.spring.test.spingorm.product.entity.Product;

public interface ProductDao {

	int createProduct(Product product);
	void updateProduct(Product product);
}
