package com.grg.sample;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<People> peoples = new ArrayList<People>();
		People man = new Man("man");
		People wenman = new Wenman("wenman");
		People tiger = new Tiger("tiger");
		
		peoples.add(man);
		peoples.add(wenman);
		peoples.add(tiger);
		
		People people = getPeople(peoples, "tiger");
		people.say();
	}

	
	private static People getPeople(List<People> peoples, String name) {
		People p = null;
		for (People people : peoples) {
			if (people.getName().equals(name)) {
				p = people;
				break;
			}
		}
		return p;
	}
}
