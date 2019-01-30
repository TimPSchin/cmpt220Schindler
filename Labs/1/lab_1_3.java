import java.util.Scanner;
public class lab_1_3 {
	public static void main(String[] args) {
		Scanner banter = new Scanner(System.in);
		
		System.out.print("Enter an amount for ounces: ");
		double oz = banter.nextDouble();
		double grams = oz * 28.3495; 
		System.out.print(oz + " ounces is " + grams);
		
	}
}
