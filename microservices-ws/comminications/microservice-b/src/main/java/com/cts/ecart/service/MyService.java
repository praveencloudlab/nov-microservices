package com.cts.ecart.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class MyService {

	private final WebClient webClient;

	public MyService(WebClient webClient) {
		this.webClient = webClient;
	}
	
	public Mono<String> getMessage(){
	    Mono<String> message = webClient.get()
	    .uri("/api/service1")
	    .retrieve()
	    .bodyToMono(String.class);
	    return message;

	  }
	
	

}
