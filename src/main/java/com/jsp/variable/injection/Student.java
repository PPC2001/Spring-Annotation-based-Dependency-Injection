package com.jsp.variable.injection;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value(value="pratik")
	private String name;
	
	@Value(value="pratik@gmail.com")
	private String email;
	
	
	public void printDetails() {
		System.out.println(name);
		System.out.println(email);
	}
}
