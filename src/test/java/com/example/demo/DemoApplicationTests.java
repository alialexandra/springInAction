package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { DemoApplicationTests.class })
@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
