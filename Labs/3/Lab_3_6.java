package softwareDevelopement;
import java.util.Scanner;
public class Lab_3_6 {
	public static void main(String[] args) {
		Scanner banter = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word = banter.next();
		System.out.println("The amount of vowels are " + amountOfVowels(word));
	}

	private static int amountOfVowels(String a) {
		int count = 0;
		String vowelWord = a.toLowerCase();
		for(int i = 0; i < vowelWord.length(); i++) {
			switch(vowelWord.substring(i, i+1)) {
			case "a": count++;
				break;
			case "e": count++;
				break;
			case "i": count++;
				break;
			case "o": count++;
				break;
			case "u": count++;
				break;
			
			}
		}
		return count;
	}

}
