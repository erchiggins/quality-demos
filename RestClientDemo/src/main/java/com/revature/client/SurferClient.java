package com.revature.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.revature.beans.Surfer;

@Component("surferClient")
public class SurferClient {

	private String resourceUrl;

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	@Autowired
	private RestTemplate restTemplate;

	// Jackson is doing a lot of work behind the scenes
	// We can use the .exchange method instead of getForEntity to achieve finer-grained control of the request being sent 
	public List<Surfer> getSurfers() {
		ResponseEntity<List<Surfer>> response = this.restTemplate.exchange(this.resourceUrl + "/allSurfers",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Surfer>>() {
				});
		return response.getBody();
	}

	public Surfer addSurfer(Surfer Surfer) {
		HttpEntity<Surfer> request = new HttpEntity<Surfer>(Surfer);
		return this.restTemplate.postForObject(this.resourceUrl + "/addSurfer", request, Surfer.class);
	}

}
