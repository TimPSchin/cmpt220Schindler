package softwareDevelopement;
import java.util.Scanner;
public class Lab_5_1 {
	public static void main(String args[]) {
		Scanner banter = new Scanner(System.in);
		double[] storage = new double[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter a number: ");
			storage[i] = banter.nextDouble();
		}
		
		System.out.println("The max number is " + max(storage));
		 
	}
	
	
	public static double max(double[] array) {
		double currentMax = array[0];
		for(int i = 1; i < array.length; i++) {
			if(currentMax < array[i]) {
				currentMax = array[i];
			}
		}
		
		return currentMax;
	}
	
}
