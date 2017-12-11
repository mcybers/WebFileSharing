package com.study.webfilesharing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.webfilesharing.service.TestService;

@CrossOrigin
@RestController
public class TestController {
	
	private final TestService testService;
	
	@Autowired
	public TestController(TestService testService) {
		this.testService = testService;
	}
		
	@RequestMapping("/")
	public String root() {
		return "Spring Boot Test";
	}
}
