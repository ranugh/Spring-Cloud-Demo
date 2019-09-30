package com.login.ui.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
	
	@RequestMapping(value="/login/{name}")
	public String getLogin(@PathVariable String name) {
		
		return "hello" + name;
		
	}
	
	

}
