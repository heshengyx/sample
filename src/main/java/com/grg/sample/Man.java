package com.grg.sample;

public class Man implements People {
	
	private String name;

	public Man(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void say() {
		System.out.println("I am " + name);
	}
}
