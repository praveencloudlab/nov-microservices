package com.cts.ecart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/service1")
public class ServiceARestController {
	
	@GetMapping
	public String getMessage() {
		return "Good Morning";
	}

}
