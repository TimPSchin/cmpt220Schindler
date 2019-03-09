package softwareDevelopement;
import java.util.Scanner;
public class Lab_5_4 {
	public static void main(String args[]) {
		Scanner banter = new Scanner(System.in);
		System.out.println("What is the size of the two arrys:");
		int size = banter.nextInt();
		int[] array1 = new int[size];
		int[] array2 = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("Enter a number for array 1: ");
			array1[i] = banter.nextInt();
		}
		
		for(int i = 0; i < size; i++) {
			System.out.println("Enter a number for array 2: ");
			array2[i] = banter.nextInt();
		}
		
		if(equal(array1, array2) == true) {
			System.out.println("Yes, the two arrays are equal.");
		}else {
			System.out.println("No, the two arrays are not equal.");
		}
		
	}
	
	public static boolean equal(int[] x, int[] y) {
		
		for (int i = 0; i < x.length; i++) {
		    for (int j = i; j < x.length; j++) {
		      if (x[j] < x[i]) {
		        int temp = x[j];
		        x[j] = x[i];
		        x[i] = temp;
		      }
		    }
		}
		
		for (int i = 0; i < y.length; i++) {
		    for (int j = i; j < y.length; j++) {
		      if (y[j] < y[i]) {
		        int temp = y[j];
		        y[j] = y[i];
		        y[i] = temp;
		      }
		    }
		  }
		
		for(int i = 0; i < x.length; i++) {
			if(x[i] != y[i]) {
				return false;
			}
		}
		
		return true;
	}
}
