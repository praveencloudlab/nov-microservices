package com.cts.ecart;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.entity.Brand;
import com.cts.ecart.entity.Category;
import com.cts.ecart.entity.Product;
import com.cts.ecart.entity.User;
import com.cts.ecart.repository.BrandRepository;
import com.cts.ecart.repository.CategoryRepository;
import com.cts.ecart.repository.ProductRepository;
import com.cts.ecart.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		CategoryRepository catRepo = context.getBean(CategoryRepository.class);
		BrandRepository brandRepo = context.getBean(BrandRepository.class);
		
		ProductRepository prodRepo = context.getBean(ProductRepository.class);
		
		//prodRepo.findAll().forEach(System.out::println);
		// catRepo.findAll().forEach(System.out::println);
		
		//brandRepo.findAll().forEach(System.out::println);
		
		/*
		 Category catObj = catRepo.findById(82).orElse(null);
		 
		 System.out.println(catObj.getCategoryTitle());
		 for(Brand b:catObj.getBrands()) {
			 System.out.println(b.getBrandTitle());
		 }
		 */
		
		//List<Product> prods = prodRepo.findByProductTitle("Iphone 14 Pro");
		List<Product> prods = prodRepo.findByProductTitleLike("%Laptop%");

		prods.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
	}

}
