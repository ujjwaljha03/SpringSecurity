package com.ujjwal.SpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Api {
	@GetMapping("/home")
	public String home(HttpServletRequest request) {
		return "Secured Page" + request.getSession().getId();
	}
}
