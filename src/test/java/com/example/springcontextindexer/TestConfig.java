package com.example.springcontextindexer;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TestConfig {
	@Bean @Primary
	public Clock testClock() {
		return Clock.fixed(ZonedDateTime.of(2018, 11, 28, 11, 03, 20, 00, ZoneId.of("Europe/Zurich")).toInstant(), ZoneId.systemDefault());
	}
}
