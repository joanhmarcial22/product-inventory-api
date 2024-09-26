package com.productinventory;

import com.productinventory.entity.Product;
import com.productinventory.entity.ProductType;
import com.productinventory.repository.ProductRepository;
import com.productinventory.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests
{

	@Autowired private ProductService productService;

	@Autowired private ProductRepository productRepository;

	@Test public void testUpdateProduct()
	{
		// Create and save a new product
		Product product = new Product();
		product.setName("Test Product");
		product.setDescription("Test Description");
		product.setType(ProductType.ELECTRONIC);
		product.setQuantity(10);
		product.setPrice(999.99);
		Product savedProduct = productRepository.save(product);

		// Update the product details
		Product updatedProduct = new Product();
		updated
	}
}
