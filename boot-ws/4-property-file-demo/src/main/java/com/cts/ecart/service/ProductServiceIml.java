package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceIml {
	
	//@Value("${namee}") // spEL
	private String personName;
	
	@Autowired
	private Environment env;
	
	@Bean
	public void f1() {
		
		for(String s1:env.getActiveProfiles()) {
		
			System.out.println("...."+s1);
		}
		System.out.println("============================");
		//System.out.println("Name is "+personName);
		System.out.println("Name is "+env.getProperty("name"));
		//System.out.println(env.getProperty("a.b.c.d.e.f"));
	}

}
