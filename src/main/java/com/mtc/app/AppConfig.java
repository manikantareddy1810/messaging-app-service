package com.mtc.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;


@Configuration
public class AppConfig {
	
	@RequestMapping("/message")
	@Bean
	public KafkaTemplate<String, TradeMessage> kafkaTemplate() {
		return null; 
	 }
	
	@RequestMapping("/find")
	@Bean
	public RestTemplate restTemplate() {
		return null; 
		
		
	}


}
