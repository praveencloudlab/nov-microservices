package com.cts.ecart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderRestController {
	
	@GetMapping
	public String f1() {
		return "f1::GET MAPPING:: ORDERCONTROLLER";
	}

}
