package com.example.springcontextindexer;

import java.time.Clock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Clock clock() {
		return Clock.systemDefaultZone();
	}
}
