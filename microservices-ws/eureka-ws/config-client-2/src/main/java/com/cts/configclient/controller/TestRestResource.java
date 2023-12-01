package com.cts.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.configclient.service.TestServiceImpl;

@RestController
@RequestMapping("/api/test2")
@RefreshScope
public class TestRestResource {
	
	@Value("${store.location}")
	private String storeLocation;
	
	@Autowired
	private TestServiceImpl ts;
	
	@GetMapping
	public String getStoreName() {
		return "Connected store is "+storeLocation;
	}
	
	@GetMapping("/name")
	public String getName() {
		return "Person Name in Service2: "+ts.getPersonName();
	}

}
