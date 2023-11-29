package com.cts.order.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class Sender {
	
	@Autowired
	private RabbitTemplate rt;
	
	
	
	@Bean
	public Queue f1() {
		System.out.println(">>>> Creating Q1...");
		return new Queue("Q1", false);
	}
	
	@Bean
	public Queue f11() {
		System.out.println(">>>> Creating Q2...");
		return new Queue("Q2", true);
	}
	
	
	@Bean
	public void sendOrderInformation() {
		
		Map<String, Object> orderInfo=new HashMap<String, Object>();
		orderInfo.put("ORDER_ID", "ABCDH863484");
		orderInfo.put("ORDER_DATE", LocalDateTime.now());
		orderInfo.put("USER_ID", "praveen");
		//orderInfo.put("ORDER_ITEMS", new ArrayList<Object>());
		
		rt.convertAndSend("Q2",orderInfo);
	}
	
	@Bean
	public void sendMessage() {
		rt.convertAndSend("Q1","Data2");
	}
	
	
	
	
	
	

}
