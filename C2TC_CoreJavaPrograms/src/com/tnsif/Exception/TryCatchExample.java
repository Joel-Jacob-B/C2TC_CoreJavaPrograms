package com.tnsif.Exception;

public class TryCatchExample {

	public static void main(String[] args) {
		
		int result = TryCatchBlocks.PerformDivision(10,0);
		if (result != 0){
			System.out.println("Result: " + result);
		}

	}

}
