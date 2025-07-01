package com.tnsif.Exception;

public class Exception {

	public static void main(String[] args) {

		try {
		int arr[] = {10, 20, 30, 40, 50};
		System.out.println(arr[6]);

	} catch (ArrayIndexOutOfBoundsException e) {
		System.err.println(e.getMessage());
	}
		System.out.println("Out of Try block");
	}
}
