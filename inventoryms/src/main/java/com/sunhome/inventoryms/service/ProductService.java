package com.sunhome.inventoryms.service;

import java.util.List;
import java.util.Optional;

import com.sunhome.inventoryms.catalogue.Product;

public interface ProductService {
	    Object getAllProduct(Optional<String> name);
	    Optional<Product> getSingleProduct(Long productId);
	    Product createProduct(String name,int stock);
	    void updateProduct(String name,int stock);
	    void deleteProduct(String name);
		Optional<Product> getProductByName(String name);
}
