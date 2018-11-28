package com.example.springcontextindexer;

import java.time.Clock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringContextIndexerApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(SpringContextIndexerApplication.class, args);
	}

	@Autowired
	private Clock clock;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(clock.instant());
	}
}
