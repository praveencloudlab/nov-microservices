package com.cts.configclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "test1-service",url = "http://localhost:8081")
public interface TestService {
	
	@GetMapping("/api/test1")
	String getPersonName();
	

}
