package softwareDevelopement;
import java.util.Scanner;
public class Lab_4_3 {
	public static void main(String args[]) {
		Scanner banter = new Scanner (System.in);
		System.out.println("Enter a word to see if it is a palindrome: ");
		String word = banter.nextLine().toLowerCase();
		
		if(isPalindrome(word) == false) {
			System.out.println("The word " + word + " is not a palindrome.");
		}else {
			System.out.println("The word " + word + " is a palindrome.");
		}
		
	}
	
	public static String reverse(String s) {
		String reverseWord = "";
		for(int i = s.length()-1; i >=0; i--) {
			reverseWord += s.charAt(i);
		}
		System.out.println(reverseWord);
		return reverseWord;
		
	}
	
	public static boolean isPalindrome(String s) {
		String reverseWord = reverse(s);
		System.out.println(reverseWord + s);
		if(reverseWord.equals(s)) {
			return true;
		}else {
			return false;
		}
	}
}
