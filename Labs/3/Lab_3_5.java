package softwareDevelopement;
import java.util.Scanner;
public class Lab_3_5 {
	public static void main(String[] args) {
		Scanner banter = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		double a = banter.nextDouble();
		System.out.println("Enter the second number:");
		double b = banter.nextDouble();
		System.out.println("Enter the third number:");
		double c = banter.nextDouble();
		
		System.out.println("The average is :" + average(a, b, c));
	}
	
	public static double average(double a, double b, double c) {
		double average = (a+b+c)/3;
		return average;
	}
}
