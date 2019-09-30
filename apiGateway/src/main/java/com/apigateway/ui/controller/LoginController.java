package com.apigateway.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LoginController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/login/{name}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "fallbackMethod")
	public String getLogin(@PathVariable String name) {
		System.out.println("Getting Employee details for " + name);

		String response = restTemplate.exchange("http://login-service/login/{name}",
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
				}, name).getBody();

		System.out.println("Response Body " + response);

		return response;
	}

	public String fallbackMethod(String name) {

		return "Fallback response:: No employee details available temporarily";
	}

	


}
