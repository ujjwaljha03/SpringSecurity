package com.ujjwal.SpringSecurityOathVersion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hello() {
		return " Hey There! How was the experience with Oath login";
	}
}
