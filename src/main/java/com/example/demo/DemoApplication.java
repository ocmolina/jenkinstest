package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/hello")
	public String hello() {
	    return "hello there! I'm running on port " + port;
    }

	public static void main(String[] args) {
		System.out.println("test");
		System.out.println("aaa");
		System.out.println("hello");
		System.out.println("hello there again!");
		SpringApplication.run(DemoApplication.class, args);
	}

}
