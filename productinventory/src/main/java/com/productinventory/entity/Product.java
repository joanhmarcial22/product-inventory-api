package com.productinventory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	private String description;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private ProductType type;

	@Column(nullable = false)
	private int quantity;

	@Column(nullable = false)
	private double price;
}

enum ProductType {
	FOOD, SPORTS, HOUSEHOLD, MUSIC, ELECTRONIC, APPLIANCE
}
