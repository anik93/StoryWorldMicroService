package com.storyworld.story.test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("COMMENT SERVICE")
public interface RestImpt {

	@RequestMapping(method = RequestMethod.GET, value = "/a")
	public String getRestaurants();

}
