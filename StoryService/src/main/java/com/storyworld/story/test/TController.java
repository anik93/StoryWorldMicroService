package com.storyworld.story.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(method = RequestMethod.GET, value = "x")
	public String s() {
		restTemplate.exchange("http:USER SERVICE:8080/a", HttpMethod.GET, null,
				new ParameterizedTypeReference<String>() {
				}, "");
		return "x";
	}

}
