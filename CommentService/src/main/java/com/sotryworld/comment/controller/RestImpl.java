package com.sotryworld.comment.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "http://USER-SERVICE")
public interface RestImpl {

	@GetMapping("/a")
	public String getUser();

}
