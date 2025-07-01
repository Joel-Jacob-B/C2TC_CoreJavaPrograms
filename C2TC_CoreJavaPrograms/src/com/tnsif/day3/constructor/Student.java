package com.tnsif.day3.constructor;

public class Student {
	private String name, course;
	private int age;
	
	Student() {
		this.name = "Jacob";
		this.age = 20;
		this.course = "Engineering";
		System.out.println("Default Constructor....");
	}

	Student(String name, int age, String course){
		this.name = name;
		this.age = age;
		this.course = course;
		System.out.println("Parameterized Constructor....");
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", age=" + age + "]";
	}
	
	
}
