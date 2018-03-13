package com.storyworld.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class UserController {

	@HystrixCommand(fallbackMethod = "default1")
	@GetMapping("/a")
	public ResponseEntity<String> x() {
		return new ResponseEntity<String>("W", HttpStatus.OK);
	}

	@HystrixCommand(fallbackMethod = "default1")
	@GetMapping("/b")
	public ResponseEntity<String> b() {
		try {
			throw new Exception();
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<String> default1() {
		System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

}
