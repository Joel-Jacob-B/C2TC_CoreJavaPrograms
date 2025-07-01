package com.tnsif.day1;

import java.util.Scanner;
public class AdditionScanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("Enter a value: ");
		a = sc.nextInt();
		System.out.println("Enter b value: ");
		b = sc.nextInt();
		c = a+b;
		System.out.println("Addition of " +a+ " and " +b+ " is " +c);
		sc.close();
	}
}
