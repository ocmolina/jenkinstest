package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testing() {
		Assertions.assertTrue(true);
	}


    @Test
    void testingFail() {
        Assertions.assertTrue(false);
    }

}
