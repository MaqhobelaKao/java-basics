package com.opticsolutions.funcional_programming.hw;

import java.util.Arrays;
import java.util.Scanner;

public class SortWordsInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter world separated by space");
		String line = scanner.nextLine();

		String[] words = line.split("\\s+");

		Arrays.sort(words, (s1, s2) -> {
			int result = s2.length() - s1.length();
			if (result == 0) {
				result = s1.compareToIgnoreCase(s2);
			}
			return result;
		});

		for (String word : words) {
			System.out.print(word + " ");
		}
	}
}
