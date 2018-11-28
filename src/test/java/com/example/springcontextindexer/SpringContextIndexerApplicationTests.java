package com.example.springcontextindexer;

import static org.junit.Assert.assertEquals;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringContextIndexerApplicationTests {

	@Autowired
	private Clock clock;

	@Test
	public void contextLoads() {
		assertEquals(
			ZonedDateTime.of(2018, 11, 28, 11, 03, 20, 00, ZoneId.of("Europe/Zurich")).toInstant(),
			clock.instant()
		);
	}
}
