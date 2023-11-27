package com.cts.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecart.entity.Category;
import com.cts.ecart.repository.CategoryRepository;
@Service
public class CategoryServiceImpl {
	
	@Autowired
	private CategoryRepository catRepo;
	
	// find all categories only
	
	public List<Category> findcategories(){
		List<Category> categories = catRepo.findAll();
		// filter categories object here...
		
		
		return null;
	}
	

}
