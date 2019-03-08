package softwareDevelopement;
import java.util.Scanner;
public class Lab_4_7 {
	public static void main(String args[]){
		Scanner banter = new Scanner(System.in);
		System.out.println("Enter numbers with spaces: ");
		String numbers = banter.nextLine();
		String[] firstLine = numbers.split(" ");
		String splitNumbers = "";
		splitNumbers += firstLine[0];
		
		for(int i = 1; i < firstLine.length; i++) {
			for(int j = 0; j <= i; i++) {
				if(firstLine[i] == firstLine[j])
					break;
				else if(j == i && firstLine[i] == firstLine[j])
					splitNumbers += " ";
					splitNumbers += firstLine[i];	
			}
		}
		
		// JA: ?
		String[] noDups = splitNumbers.split(" ");
		
		for(int i = 0; i < noDups.length; i++) {
			System.out.print(noDups[i] + " ");
		}
		
	}
}
