package com.opticsolutions.functions;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");

		String input = sc.nextLine();
		String[] numbers = input.split("\\s+");
		

		// Convention the array of string to of integer
		int[] intNumbers = new int[numbers.length];
		int index = 0;
		for (String number : numbers)
			intNumbers[index++] = Integer.parseInt(number);

		// Find and print the maximum value of the integer list
		int maxInt = findMaxIntInArray(intNumbers);
		System.out.println(maxInt);
	}

	public static int findMaxIntInArray(int[] intArray) {
		int max = 0;
		if (intArray.length > 1) {
			for (int i = 0; i < intArray.length; i++) {
				if (intArray[i] > max)
					max = intArray[i];
			}
		} else {
			max = intArray[0];
		}

		return max;
	}
}
