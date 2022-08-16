package com.opticsolutions.loops;

import java.util.Scanner;

public class PrintinfEachIntegerFromNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any integer: ");
		Integer number = sc.nextInt();
		char[] numberArray = number.toString().toCharArray();
		for (char a : numberArray)
			System.out.println(a);
		
		
		
		
	}
}
