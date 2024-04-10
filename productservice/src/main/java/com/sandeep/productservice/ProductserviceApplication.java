package com.sandeep.productservice;

import com.sandeep.productservice.models.Category;
import com.sandeep.productservice.models.Product;
import com.sandeep.productservice.repository.CategotyRepository;
import com.sandeep.productservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductserviceApplication implements CommandLineRunner {

	private final ProductRepository productRepository;
	private final CategotyRepository categotyRepository;

	public ProductserviceApplication(ProductRepository productRepository,
									 CategotyRepository categotyRepository) {
		this.productRepository = productRepository;
		this.categotyRepository = categotyRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category = new Category();
		category.setName("Electronic Devices");
		Category saveCategory=categotyRepository.save(category);
		Product product= new Product();
		product.setPrice(10000.00);
		product.setTitle("Iphone 15");
		product.setImage("https/google.com");
		product.setDescription("Best Iphone in this Category");
		product.setCategory(saveCategory);
		productRepository.save(product);
	}
}
