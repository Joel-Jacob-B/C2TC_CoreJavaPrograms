package com.tnsif.polymorphism;

public class Person {
	
	private int id;
	private String name;
	private String city;

	Person() {
		this.id = 10;
		this.name = "Joel";
		this.city = "Chennai";
	}
	
	Person(int id) {
		this.id = id;
		this.name = "Joel";
		this.city = "Chennai";
}
	Person(int id, String name){
		this.id = id;
		this.name = name;
		this.city = "Chennai";
		
	}
	Person(int id, String name, String city){
		this.id = id;
		this.name = name;
		this.city = city;
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCity() {
		return this.city;
	}
	
}

