package softwareDevelopement;

import java.util.Scanner;

public class Lab_5_7 {
	public static void main(String args[]) {
		Scanner banter = new Scanner(System.in);
		System.out.println("What is the size of the matrix:");
		int size = banter.nextInt();

		double[][]  matrix = new double[size][size];
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.println("What is the value of row " + (i+1) + " column " + (j+1) + "?");
				matrix[i][j] = banter.nextDouble();
			}
		}
		
		if(isUpperTriangular(matrix) == true) {
			System.out.println("Your matrix is upper triangular?");
		}else {
			System.out.println("Your matrix is not upper triangular?");
		}
		
    }
	
	
	public static boolean isUpperTriangular(double[] [] array) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(j > i && array[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}
	
}