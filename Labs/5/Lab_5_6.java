package softwareDevelopement;
import java.util.Scanner;
public class Lab_5_6 {
	public static void main(String args[]) {
		Scanner banter = new Scanner(System.in);
		System.out.println("What is the size of the matrix:");
		int size = banter.nextInt();

		double[][]  matrix = new double[size][size];
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.println("What is the value of row " + (i+1) + " column " + (j+1) + "?");
				matrix[i][j] = banter.nextInt();
			}
		}
		
		System.out.println("What column do you want to know the average of:");
		int column = banter.nextInt();
		
		System.out.println("The average of column number " + column + " is " + averageRow(matrix, column));
	}
	
	public static double averageRow(double[][] array, int column) {
		double average; 
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i][column-1];
		}
		average = sum/array.length;
		return average;
	}
}
