package com.cts.ecart.resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecart.model.Product;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
	
	@GetMapping
	public String f1() {
		return "f1::GET MAPPING..";
	}
	
	@GetMapping("/{id}")
	public String f1111(@PathVariable("id") int productId) {
		
		return "f1111::GET MAPPING - "+productId;
	}
	
	@GetMapping(value = "s1")
	public String f11() {
		return "f11::GET MAPPING..";
	}
	
	@GetMapping(value = "s2")
	public String f111() {
		return "f111::GET MAPPING..";
	}
	
	@PostMapping
	public Product f2(@RequestBody Product prod) {
		System.out.println(prod);
		return prod;
	}
	
	
	
	@PutMapping
	public String f3() {
		return "f3::PUT MAPPING..";
	}
	
	
	@PatchMapping
	public String f4() {
		return "f4::PATCH MAPPING..";
	}
	
	@DeleteMapping
	public String f5() {
		return "f5::DELETE MAPPING..";
	}

	
	
	
	
}
