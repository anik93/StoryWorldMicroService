package com.storyworld.turbine;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableTurbineStream
// @EnableTurbine
@EnableDiscoveryClient
public class TurbineApplication {

	@Value("${app.rabbitmq.host:localhost}")
	private String rabbitMQHost;

	@Bean
	public ConnectionFactory connectionFactory() {
		return new CachingConnectionFactory(rabbitMQHost);
	}

	public static void main(String[] args) {
		SpringApplication.run(TurbineApplication.class, args);
	}

}
