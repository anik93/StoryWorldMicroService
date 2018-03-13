package com.sotryworld.comment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private RestImpl restImpl;

	@GetMapping("/g")
	public String get() {
		return restImpl.getUser();
	}

}
