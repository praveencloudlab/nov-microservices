package com.cts.ecart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping(value = "/s1")
	public String testMethod(Model model) {
		
		String userName="Praveen";
		
		model.addAttribute("user", userName);
		
		System.out.println(">>> Server logged message:: testMethod");
		
		return "hello";
	}
	
	@RequestMapping("/s2")
	@ResponseBody
	public String f2() {
		return "Good Morning!";
	}

}
