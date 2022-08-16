package com.opticsolutions.loops;

public class MatrixPrinting {

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3, 4, 5,},
				{6, 7},
				{8, 9, 10}
		};
		System.out.println("Lennth of the matrix " + matrix.length);
		for(int i = 0; i < matrix.length; i++){
		    for(int a : matrix[i]) {
		        System.out.printf("%d ", a);
		    }
		    System.out.println("");
		}
	}

}
