package com.spring.test.spingorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.spingorm.product.dao.ProductDao;
import com.spring.test.spingorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/test/spingorm/product/test/config.xml");
		ProductDao dao = (ProductDao) context.getBean("productDao");
		Product product = new Product();
		product.setProduct_id(2);
		product.setProduct_name("Xiomi");
		product.setProduct_price(14999);
		dao.createProduct(product);
		
		
//		dao.updateProduct(product);
	}
}
