package com.jk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/enp2")
public class WishController {

	@GetMapping(value = "/")
	public String msg() {
		return "Welcome to Java Mind -> Sharing is caring";
	}
}
