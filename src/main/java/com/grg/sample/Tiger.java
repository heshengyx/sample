package com.grg.sample;

public class Tiger implements People {
	
	private String name;

	public Tiger(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void say() {
		System.out.println("I am " + name);
	}

}
