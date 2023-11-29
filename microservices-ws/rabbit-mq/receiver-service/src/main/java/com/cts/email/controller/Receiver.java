package com.cts.email.controller;

import java.util.Map;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class Receiver {
	
	
	@Bean
	public Queue f1() {
		System.out.println(">>>> Receiver :: Creating Q1...");
		return new Queue("Q1", false);
	}
	/*
	@RabbitListener(queues = "Q1")
	public void f2(String msg) {
		System.out.println("========================");
		System.out.println(msg);
		System.out.println("========================");

	}
	*/
	
	@RabbitListener(queues = "Q2")
	public void f22(Map<String, Object> orderData) {
		System.out.println("========================");
		System.out.println(orderData);
		System.out.println("========================");

	}
	
	

}
