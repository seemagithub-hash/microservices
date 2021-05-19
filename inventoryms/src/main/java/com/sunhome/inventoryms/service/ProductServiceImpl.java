package com.sunhome.inventoryms.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sunhome.inventoryms.catalogue.Product;
import com.sunhome.inventoryms.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
 private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);
 private final ProductRepository productRepository;
 //private final ProductService productService;
 
 //public ProductServiceImpl(ProductRepository productRepository, ProductService productService) {
 public ProductServiceImpl(ProductRepository productRepository) {
     this.productRepository = productRepository;
     //this.productService = productService;
 }
	@Override
	public List<Product> getAllProduct(Optional<String> name) {
		// TODO Auto-generated method stub
		 LOGGER.info("************getAllProduct************");
		 if (name.isPresent()) {
	            Optional<List<Product>> optionalUserList = productRepository.findByNameContainingIgnoreCase(name.get());
	            return optionalUserList.orElse(Collections.emptyList());
	     }
		 LOGGER.info("************getAllProduct************");
		return productRepository.findAll();
	}

	 
	@Override
	public Optional<Product> getProductByName(String name) {
		// TODO Auto-generated method stub
		LOGGER.info("************getProduct************");
		productRepository.findByNameContainingIgnoreCase(name);
		 LOGGER.info("************getProduct************");
		return null;
	}
	

	@Override
    public Optional<Product> getSingleProduct(Long productId) {
        LOGGER.info("******getSingleProduct******");
        return productRepository.findById(productId);
      
    }

	@Override
	public Product createProduct(String name, int stock) {
		// TODO Auto-generated method stub
		LOGGER.info("************createProduct************");
		productRepository.save(new Product(name,stock));
		 LOGGER.info("************createProduct************");
		return null;
	}

	@Override
	public void updateProduct(String name, int stock) {
		// TODO Auto-generated method stub
		LOGGER.info("************updateProduct************");
		productRepository.save(new Product(name,stock));
		LOGGER.info("************updateProduct************");
	}

	@Override
	public void deleteProduct(String name) {
		// TODO Auto-generated method stub
		 LOGGER.info("************deleteProduct************");
		Optional<List<Product>> optionalUserList = productRepository.findByNameContainingIgnoreCase(name);
		Product prod= optionalUserList.orElse(Collections.emptyList()).get(0);
		prod.getId();
		//productRepository.delete(new Product( name,  stock));
		productRepository.deleteById(prod.getId());
	     LOGGER.info("************deleteProduct************");
	}

	
}
