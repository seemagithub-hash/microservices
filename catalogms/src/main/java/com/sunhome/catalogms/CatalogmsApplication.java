package com.sunhome.catalogms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CatalogmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogmsApplication.class, args);
	}

}
