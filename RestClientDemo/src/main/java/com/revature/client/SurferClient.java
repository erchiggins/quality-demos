package com.revature.client;

import org.springframework.stereotype.Component;

@Component("surferClient")
public class SurferClient {
	
	private String resourceUrl;
	
	public void setResourceUrl(String resourceUrl){
		this.resourceUrl = resourceUrl;
	}

}
