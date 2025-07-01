package com.tnsif.polymorphism;

public class Executor {

	public static void main(String[] args) {
		
		int value1 = PolymorphismExample.addition(10, 30);
		double value2 = PolymorphismExample.addition(10.5, 30.5);
		String value3 = PolymorphismExample.addition("Hello", "Sir");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		Person p1 = new Person(25, "Chennai");
		System.out.println(p1.getId());
		System.out.println(p1.getName());

	}

}
