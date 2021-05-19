package com.sunhome.inventoryms.restservice;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunhome.inventoryms.catalogue.Product;
import com.sunhome.inventoryms.service.ProductService;

@RestController
public class ProductRestService {
	@SuppressWarnings("unused")
	private final ProductService productService;
	
	public ProductRestService(ProductService productService) {
        this.productService = productService;
    }
	
	 @GetMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity getAllProduct(@RequestHeader(name = "x-location", required = false) String location, @RequestParam(required = false) String name) {
	        System.out.println("x-location: " + location);
	        return ResponseEntity.ok(productService.getAllProduct(Optional.ofNullable(name)));
	  }
	 
	 @GetMapping("/product/{productId}")
	    public ResponseEntity getAllUsers(@PathVariable Long productId) {
	        Optional<Product> product = productService.getSingleProduct(productId);
	        if (product.isPresent()) {
	            return ResponseEntity.ok(product.get());
	        }

	        return ResponseEntity.notFound().build();
	    }
	 
	 @PostMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
	    //public ResponseEntity createUser(@RequestBody Product product) throws URISyntaxException {
	 	public ResponseEntity createProduct(@RequestParam(required = true) String name,@RequestParam(required = true) int stock) throws URISyntaxException {
		 Product productCreated = productService.createProduct(name,stock);
	        return ResponseEntity.created(new URI(productCreated.getId().toString())).build();
	    }
	
}
