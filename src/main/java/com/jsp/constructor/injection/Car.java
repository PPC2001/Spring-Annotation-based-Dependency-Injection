package com.jsp.constructor.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private String name;
	private String brand;

	Car(@Value(value = "Thar") String name, @Value(value = "Mahindra") String brand) {
		this.name = name;
		this.brand = brand;
	}

	public void printDetails() {
		System.out.println(name);
		System.out.println(brand);
	}
}
