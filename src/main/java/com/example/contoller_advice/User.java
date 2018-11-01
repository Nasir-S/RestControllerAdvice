package com.example.contoller_advice;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

public class User {

	@Size(max = 10)
	private String name;
	@Max(200)
	private int age;

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
