package softwareDevelopement;
import java.util.Scanner;
public class Lab_2_3 {
	public static void main(String[] args) {
		Scanner banter = new Scanner(System.in);
		System.out.println("What is the smallest number you want: ");
		int min = banter.nextInt();
		System.out.println("What is the largest number you want: ");
		int max = banter.nextInt();
		int num = (int)(Math.random()*max)+min; // JA: It was three random values
		
		System.out.println("Your number is " + num);
	}


}
