package com.unitbv.events.configuration;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.unitbv.events.service.CarService;
import com.unitbv.events.service.PersonService;

@Configuration
public class AppConfig {
	
	private ApplicationEventPublisher eventPublisher;
	
	@Bean
	public PersonService personBean() {
		return new PersonService(eventPublisher);
	}
	
	@Bean
	public CarService carBean() {
		return new CarService();
	}
}
