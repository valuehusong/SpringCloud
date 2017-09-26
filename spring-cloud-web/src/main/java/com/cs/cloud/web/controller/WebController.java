package com.cs.cloud.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cs.cloud.web.entity.User;

@RestController
public class WebController {

	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/web/{id}")
	public User findById(@PathVariable Long id) {
		return restTemplate.getForObject("http://localhost:7900/simple/" + id, User.class);
	}
}
