package com.cts.ecart.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
//@Lazy(value = false) // default
//By default eager init is enabled...s
//@Lazy // lazy is set to true

@Scope("singleton") // default scope
//@Scope("prototype")
public class ProductServiceImpl implements InitializingBean,DisposableBean{
	
	
	public ProductServiceImpl() {
		System.out.println(">>>> 1 constructor on "+System.identityHashCode(this));
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(">>> 2.After constructor on "+System.identityHashCode(this));
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(">>>> 3.Destroy");
		
	}
	
	
	
	
	/*
	
	public ProductServiceImpl() {
		System.out.println(">>> 1:: ProductServiceImpl:: Constructor on "+System.identityHashCode(this));
	}

	
	@PostConstruct
	public void f2() {
		System.out.println(">>> f2:: 2.PostConstruct on "+System.identityHashCode(this));
	}
	
	@Bean // will not work on lazy bean type
	// bean creates separate objects if the scope is prototype
	 void f3() {
		System.out.println(">>> f3:: 3.Bean on "+System.identityHashCode(this));
	}
	
	@PreDestroy // will not work on prototype scope
	public void f4() {
		System.out.println(">>> f4:: 4.PreDestroy");

	}
	
	
	*/
	
	
	
	

}
