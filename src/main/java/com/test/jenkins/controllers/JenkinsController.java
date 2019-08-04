package com.test.jenkins.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	@GetMapping("/jenkins")
	public String hello() {
		
		return "Jenkins working fine ...";

	}
}
