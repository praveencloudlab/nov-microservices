package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.service.ProductServiceImpl;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ac= SpringApplication.run(Application.class, args);
		
		//ProductServiceImpl ps=(ProductServiceImpl) ac.getBean("productServiceImpl");
		//ProductServiceImpl ps = ac.getBean("productServiceImpl",ProductServiceImpl.class);
		 ProductServiceImpl ps1 = ac.getBean(ProductServiceImpl.class);
		 ProductServiceImpl ps2 = ac.getBean(ProductServiceImpl.class);
		 //ps1.f1();
		 //ps2.f1();
	
	}
	
	
	
	

}
