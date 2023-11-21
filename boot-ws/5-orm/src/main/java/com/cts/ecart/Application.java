package com.cts.ecart;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.entity.User;
import com.cts.ecart.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserRepository userRepo = context.getBean(UserRepository.class);
		
		User u1=new User("james", "james@abc.com", "USA", LocalDate.of(1982, 7, 21), "James", "Goedic", 84683464, "james");
		
		//u1.setMobileNumber(1212121212);
		
		//userRepo.save(u1);
		
		userRepo.findAll().forEach(System.out::println);
		
		/*
		User user = userRepo.findById("praveen").orElse(null);
		if(user!=null)
		System.out.println(user);
		else
		System.out.println("user not found");
		*/
		
	}

}
