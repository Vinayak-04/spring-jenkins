package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger log = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	
	@Test
	void contextLoads() {
		log.info("test case executing");
		assertEquals(true, true);
	}

}
