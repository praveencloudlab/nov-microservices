package com.cts.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test1")
@RefreshScope
public class TestRestResource {
	
	@Value("${name}")
	private String personName;
	
	@GetMapping
	public String getName() {
		return personName;
	}

}
