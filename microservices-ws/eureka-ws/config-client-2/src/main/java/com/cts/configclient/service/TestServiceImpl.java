package com.cts.configclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl {
	
	@Autowired
	private TestService ts;
	
	
	public String getPersonName() {
		return ts.getPersonName();
	}

}
