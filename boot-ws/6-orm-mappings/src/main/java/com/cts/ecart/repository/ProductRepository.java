package com.cts.ecart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Price;
import com.cts.ecart.entity.Product;
import com.cts.ecart.entity.Stock;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	//Domain-specific language (DSL)
	
	List<Product> findByProductTitle(String s1);
	List<Product> findByProductTitleLike(String s1);

	
	

}
