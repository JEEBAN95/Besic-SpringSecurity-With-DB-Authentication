package com.jk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/enp1")
public class WelcomeController {

	@GetMapping(value = "/")
	public String welcome() {
		return "Welcome to Java Mind";
	}
}
