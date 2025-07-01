package com.tnsif.polymorphism.overriding;

public class Rectangle extends Shape {

	public Rectangle(int length, int breadth) {
		super.length = length;
		super.breadth = breadth;
	}
	
	@Override
	public void calArea() {
		System.out.println(super.length * super.breadth);
	}
	
}
