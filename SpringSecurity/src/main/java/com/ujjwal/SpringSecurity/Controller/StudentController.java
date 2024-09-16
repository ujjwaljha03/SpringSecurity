package com.ujjwal.SpringSecurity.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ujjwal.SpringSecurity.Model.Students;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
	
	private List<Students> students = new ArrayList<>(List.of(
			new Students(1,"Ujjwal",90),
			new Students(2,"Sanket",90)
			));
	
	@GetMapping("/students")
	public List<Students> getStuden(){
		return students;
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken)request.getAttribute("_csrf");
	}
	
	@PostMapping("/students")
	public Students addStudent(@RequestBody Students student) {
		students.add(student);
		return student;
	}
}
