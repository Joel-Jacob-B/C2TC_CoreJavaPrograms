package com.tnsif.polymorphism.overriding;

public class Executor {

	public static void main(String[] args) {
		
		Shape s1 = new Square(10);
		
		s1.calArea();
		
		Shape s2 = new Rectangle(10, 30);
		s2.calArea();

	}

}
