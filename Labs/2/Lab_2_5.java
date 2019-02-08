package softwareDevelopement;
import java.util.Scanner;
public class Lab_2_5 {
	public static void main(String[] args) {
		Scanner banter = new Scanner(System.in);
		
		System.out.println("What is the first string: ");
		System.out.println("What is the second string: ");
		String str1 = banter.nextLine();
		String str2 = banter.nextLine();
		
		int result = str1.compareTo(str2);
		
		if (result < 0) {
			System.out.println(str1);
			System.out.println(str2);
		}
		else {
			System.out.println(str2);
			System.out.println(str1);
		}
	}
}
	
