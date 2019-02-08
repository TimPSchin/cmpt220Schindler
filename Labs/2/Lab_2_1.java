package softwareDevelopement;
import java.util.Scanner;
public class Lab_2_1 {
	public static void main(String[] args){
	Scanner banter = new Scanner(System.in);
	System.out.println("Enter in the first number: ");
	double x = banter.nextDouble();
	System.out.println("Enter in the second number: ");
	double y = banter.nextDouble();
	
	
	System.out.println(x + " is less than " + y + " "+ (x < y));
	System.out.println(x + " is less than or equal to " + y + " "+ (x <= y));
	System.out.println(x + " is equal to " + y + " "+ (x == y));
	System.out.println(x + " is not equal " + y + " "+ (x != y));
	System.out.println(x + " is greater than " + y + " "+ (x > y));
	System.out.println(x + " is less than or equal to " + y + " "+ (x >= y));
	}
}
