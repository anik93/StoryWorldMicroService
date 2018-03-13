package com.storyworld.story.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

@Component
public class DiscoveryClientSample implements CommandLineRunner {

	@Autowired
	private DiscoveryClient discoveryClient;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(discoveryClient.description());
		// Pobierz instancje usługi restauracji i wyświetl informacje na jej temat
		discoveryClient.getInstances("COMMENT SERVICE")
				.forEach(serviceInstance -> System.out.println(
						new StringBuilder("Instancja -->").append(serviceInstance.getServiceId()).append("\nSerwer: ")
								.append(serviceInstance.getHost()).append(":").append(serviceInstance.getPort())
								.append("\nURI: ").append(serviceInstance.getUri()).append("\n\n\n")));
	}

}
