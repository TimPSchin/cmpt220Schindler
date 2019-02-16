package softwareDevelopement;
import java.util.Scanner;
public class Lab_3_1 {
	public static void main(String[] args) {
		Scanner banter = new Scanner(System.in);
		double num = 1;
		double sum = 0;
		double total = 0;
		double evens = 0;
		
		while(num != 0) {
			System.out.println("Enter a positive integer, the input ends with 0:");
			num = banter.nextDouble();
			if(num == 0) {
				break;
			}
			else if(num !=0) {
				sum += num;
				total ++;
			}
			if(num%2 == 0) {
				evens ++;
			}
		}
		
		System.out.println("The number of even numbers: " + evens);
		System.out.println("The total sum: " + sum);
		System.out.println("The average is: " + (sum/total));
	}

}
