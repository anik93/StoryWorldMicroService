package com.storyworld.story.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("x")
	public String s() {
		return restTemplate.getForEntity("http://USER-SERVICE/a", String.class).getBody();
	}

}
