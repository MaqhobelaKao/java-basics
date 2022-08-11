package com.opticsolutions.primitiveTypes;

public class PrimitiveTypes {
	public static void main(String[] args) {
		int number;
		byte l;
		short sum;
		long l2 = 200_000_000_000_000_00l;
		
		l = 2;
		boolean reply = true;
		
		char cahr = 'a';
		char value = 200;
		System.out.println(value);
		
		
		float floatingPointNumber = 2.0f;
		double salary = 34.0;
		
		/*
		 * Cating the bigger data type into the smaller causes JVM to pick the 
		 * lowest value that can be represent in that type
		 */
		l =  (byte) 129;
		System.out.println(l);
	}
}
