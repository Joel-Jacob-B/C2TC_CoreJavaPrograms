package com.tnsif.day6.usingfinal;

public class FinalVariable {
	public static void main(String args[]) {


	final static int Y;

	final static int Z = 10;
	@Override
	public String toString() {
		return "FinalVariable [ Y " +  Y + " ]";
	}
	

	static {
		Y = 20; 
		System.out.println("Value of Y: " + Y);
	}
	
}