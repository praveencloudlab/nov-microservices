package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecart.repository.ProductRepository;

@Service
public class ProductServiceImpl {
	
	@Autowired
	private ProductRepository productRepository;
	
	

}
