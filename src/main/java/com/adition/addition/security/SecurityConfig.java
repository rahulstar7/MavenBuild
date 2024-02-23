package com.adition.addition.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SecurityConfig {

	//Test Work completed
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
