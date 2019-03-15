package softwareDevelopement;
import java.util.Scanner;
public class Lab_5_2 {
	public static void main(String args[]) {
		Scanner banter = new Scanner(System.in);
		double[] storage = new double[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter a number: ");
			storage[i] = banter.nextDouble();
		}
		
		System.out.println("The mean is " + mean(storage));
		System.out.println("The deviation is " + deviation(storage));
	}
	
	public static double mean(double[] x) {
		double sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += x[i];
		}
		double mean = sum/x.length;
		return mean;
	}
	
	public static double deviation(double[] x) {
		double sum = 0;
		double divided = 0;
		double deviation = 0;
		for(int i = 0; i < 10; i++) {
			sum += Math.pow((x[i]-mean(x)), 2);
		}
		divided = sum/(x.length - 1); // JA
		deviation = Math.sqrt(divided);
		return deviation;
	}
	
}
