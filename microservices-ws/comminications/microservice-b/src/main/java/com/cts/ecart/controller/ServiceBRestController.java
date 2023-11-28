package com.cts.ecart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.ecart.service.MyService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/service2")
public class ServiceBRestController {
	
	private RestTemplate rt=new RestTemplate();
	
	@Autowired
	private MyService ms;
	
	
	@GetMapping
    public String display() {
    	String message = rt.getForObject("http://localhost:8081/api/service1", String.class);
    	return "Service2: "+message;
    }
	
	@GetMapping("/webclient")
	public Mono<String> webCientTest() {
		
		return ms.getMessage();
	}
	
	
	
	
	


}
