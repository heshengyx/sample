package com.grg.sample;

public class Mokey extends PeopleImpl implements People {

	{
		this.name = "dfd";
	}
	
	public Mokey(String name) {
		this.name = name;
	}
	
	public void say() {
		System.out.println("I am " + name);
	}

}
