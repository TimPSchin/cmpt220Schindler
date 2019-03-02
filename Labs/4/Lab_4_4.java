package softwareDevelopement;
import java.util.Scanner;
public class Lab_4_4 {
	
	public static void main(String args[]) {
		Scanner banter = new Scanner(System.in);
		System.out.println("Enter phrase: ");
		String phrase = banter.nextLine().toUpperCase();
		int length = phrase.length();
		int letterCount[] = new int[26];
		
		for(int i = 0; i < length; i++) {
			int imSad = (int)(phrase.charAt(i) -65);
			if(imSad >= 0 && imSad <26);
				letterCount[imSad]++;
		}
		
		for(int i = 0; i < letterCount.length; i++) {
			if(letterCount[i] > 0) {
				char letter = (char)(i + 65);
				System.out.println(letter + " occurs " + letterCount[i] + " time(s).");
			}
		}
			
	}
}
