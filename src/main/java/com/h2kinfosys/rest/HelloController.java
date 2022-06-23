package com.h2kinfosys.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	User user;

	public HelloController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping(path="/message")
	public User getMessage(String name) {
		user = new User();
		user.setName(name);
		user.setMessage("Hello , How are you?");
		return user;
	}

}
