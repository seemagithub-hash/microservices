package com.sunhome.inventoryms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunhome.inventoryms.catalogue.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	 Optional<List<Product>> findByNameContainingIgnoreCase(String name);
}
