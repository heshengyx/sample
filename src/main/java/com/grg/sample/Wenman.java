package com.grg.sample;

public class Wenman extends PeopleImpl implements People {

	public Wenman(String name) {
		this.name = name;
	}
	
	public void say() {
		System.out.println("I am " + name);
	}
}
