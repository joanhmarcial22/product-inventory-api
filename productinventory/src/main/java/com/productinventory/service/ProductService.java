package com.productinventory.service;

import com.productinventory.entity.Product;
import com.productinventory.exception.ResourceNotFoundException;
import com.productinventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(Long id) {
		return productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
	}

	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	public Product updateProduct(Long id, Product updatedProduct) {
		Product product = getProductById(id);
		product.setName(updatedProduct.getName());
		product.setDescription(updatedProduct.getDescription());
		product.setType(updatedProduct.getType());
		product.setQuantity(updatedProduct.getQuantity());
		product.setPrice(updatedProduct.getPrice());
		return productRepository.save(product);
	}

	public void deleteProduct(Long id) {
		Product product = getProductById(id);
		productRepository.delete(product);
	}
}
