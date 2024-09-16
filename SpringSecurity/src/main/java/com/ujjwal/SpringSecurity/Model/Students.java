package com.ujjwal.SpringSecurity.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {
	private int id;
	private String name;
	private int marks;
}
