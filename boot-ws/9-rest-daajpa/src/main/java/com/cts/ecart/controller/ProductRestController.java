package com.cts.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecart.entity.Category;
import com.cts.ecart.entity.Product;
import com.cts.ecart.repository.CategoryRepository;
import com.cts.ecart.repository.ProductRepository;

@RestController
@RequestMapping(value = "/api/products")
public class ProductRestController {
	
	@Autowired
	private ProductRepository prodRepo;
	@Autowired
	private CategoryRepository catRepo;
	
	@GetMapping
	public List<Product> findAll(){
		return prodRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Product findById(@PathVariable int id) {
		return prodRepo.findById(id).orElse(null);
	}
	
	@GetMapping("/filter/{title}")
	public List<Product> findByProductByName(@PathVariable String title){
		return prodRepo.findByProductTitleLike(title);
	}
	
	//list all categories
	@GetMapping("/categories")
	List<Category> findAllCategories(){
		return catRepo.findAll();
	}
	
	

}
