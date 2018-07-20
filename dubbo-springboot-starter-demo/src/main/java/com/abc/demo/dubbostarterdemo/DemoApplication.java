package com.abc.demo.dubbostarterdemo;

import com.abc.dubbo.dubbospringbootstarter.EnableDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDemo(demoName="Test")
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
