import java.util.Scanner;
public class lab_1_4 {
	public static void main(String[] args) {
		Scanner banter = new Scanner(System.in);
		
		System.out.print("What is the mass in kilograms: ");
		double c = 299972458;
		double m = banter.nextDouble();
		double E = m * (c*c);
		System.out.println("The energy is: " + E);
	}	
}
