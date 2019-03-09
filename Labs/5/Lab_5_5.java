package softwareDevelopement;
import java.util.Scanner;
public class Lab_5_5 {
	public static void main(String args[]) {
		Scanner banter = new Scanner(System.in);
		System.out.println("What is the size of the matrix:");
		int size = banter.nextInt();
		
		int[][]  matrix = new int[size][size];
		int[][]  transposedMatrix = new int[size][size];
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.println("What is the value of row " + (i+1) + " column " + (j+1) + "?");
				matrix[i][j] = banter.nextInt();
			}
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				transposedMatrix[i][j] = matrix[j][i];
			}
		}
		
		System.out.println("The transposed matrix is:");
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(transposedMatrix[i][j] +" ");;
			}
			System.out.println();
		}
		
	}
}
