package com.tnsif.Exception;

public class TryCatchBlocks {
	
	static int PerformDivision(int x, int y) {
		int z = 0;
		System.out.println("I'm inside method!");
		try {
			System.out.println("I'm inside Try block!");
			z = x/y;
		} catch (ArithmeticException e) {
			System.out.println("I'm inside Catch block! " + e.getMessage());
		}
		return z;
	}
}
