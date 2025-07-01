package com.tnsif.polymorphism.overriding;

public class Square extends Shape {
	
	public Square(int area) {
		super.area = area;
	}
	
	@Override
	public void calArea() {
		System.out.println(super.area * super.area);
	}
}
