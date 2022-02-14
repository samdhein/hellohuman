package com.samhein.hellohuman.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {

	
	@GetMapping("/") // route
	public String helloHumanName(@RequestParam(value="name", required=false) String name, @RequestParam(value="lastname", required=false) String lastname) {
		if (name == null) {
			return "Hello Human";
		} else {
		return "Hello " + name + " " + lastname;
		}
	}
}
