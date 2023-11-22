package com.cts.ecart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Price;
import com.cts.ecart.entity.Product;
import com.cts.ecart.entity.Stock;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
