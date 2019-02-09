package softwareDevelopement;
import java.util.Scanner;
public class Lab_2_4 {
	public static void main(String[] args) {
		Scanner banter = new Scanner(System.in);
		System.out.println("Enter in the first character: ");
		System.out.println("Enter in the second character: ");
		char c1 = banter.next().charAt(0);
		char c2 = banter.next().charAt(0);
		
		System.out.println("Result is: " + (c1+c2));
	}
}
