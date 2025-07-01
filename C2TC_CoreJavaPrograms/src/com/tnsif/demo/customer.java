package com.tnsif.demo;

public class customer {

	private int id;
	private String name, city;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
