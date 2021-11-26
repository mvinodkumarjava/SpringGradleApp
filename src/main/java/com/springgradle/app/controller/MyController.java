package com.springgradle.app.controller;

import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	org.apache.logging.log4j.Logger logger = LogManager.getLogger(MyController.class);

	@GetMapping
	public String hello() {
		
		logger.error("Error occured");
		return "Hi Gradle";
	}
}
