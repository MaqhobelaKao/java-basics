package com.opticsolutions.operations;

public class MathOperation {
	public static void main(String[] args) {
		System.out.println(Math.PI);		// 3.141592653589793
		System.out.println(Math.max(3, 5)); // 5
		System.out.println(Math.min(3, 5));	// 3
		System.out.println(Math.sqrt(4));	// 2.0
		System.out.println(Math.abs(-5));	// 5
		
		// 0 divide by zero.zery is flagged as not a number by JVM
		System.out.println(Math.sqrt(-1));	// NaN
		System.out.println(0 / 0.0);		// NaN
		System.out.println((0 / 0.0) + 5);	// NaN
		
		/* Any  positive number greater zero divided floating point zero
		 * is positive infinity
		 * Any negative none zero number divided by floating point zero
		 * is negative infinity
		 */
		System.out.println(5 / 0.0);		// Infinity
		System.out.println(-5 / 0.0);		// -Infinity
		
		System.out.println(Math.round(20.0 / 3.0));						// 7
		System.out.println(Math.round( 20.0 * 100.0 / 3.0) / 100.0);	// 6.67
		
		System.out.println(Math.random());						// between 0.0 and 1.0
		System.out.println((int)(Math.random() * 100)); 		// between 0 and 100 
		System.out.println((int)(Math.random() * 100) + 100); 	// between 100 and 200 
		
	}
}
