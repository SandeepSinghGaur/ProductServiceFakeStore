package com.sandeep.productservice;

import com.sandeep.productservice.models.Category;
import com.sandeep.productservice.models.Price;
import com.sandeep.productservice.repository.PriceRepository;
import com.sandeep.productservice.models.Product;
import com.sandeep.productservice.repository.CategotyRepository;
import com.sandeep.productservice.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class ProductserviceApplication {


	public static void main(String[] args) {
		SpringApplication.run(ProductserviceApplication.class, args);
	}

}
