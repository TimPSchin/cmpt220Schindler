package softwareDevelopement;
import java.util.Scanner;
public class Lab_4_8 {
	public static void main(String args[]) {
		Scanner banter = new Scanner(System.in);
		String numbers = "";
		String s = "";
		int a = 1;
		int count = 0;
		while(a !=0){
			System.out.println("Enter a number: ");
			s = banter.nextLine();
			numbers = numbers + s + " ";
			count++;
			a = Integer.valueOf(s);
		}
		
		String[] allNumbers = numbers.split(" ");
		int[] actualNumbers = new int[allNumbers.length];
		
		for(int i = 0; i < allNumbers.length; i++) {
			actualNumbers[i] = Integer.valueOf(allNumbers[i]);
		}
		
		int temp;
		for(int i = 0; i < actualNumbers.length-1; i++) {
			if(actualNumbers[i] > actualNumbers[i+1]) {
				temp = actualNumbers[i];
				actualNumbers[i]= actualNumbers[i+1];
				actualNumbers[i+1] = temp;
				i = -1;
			}
		}
		
		int onLine = 0;
		for(int i = 0; i < allNumbers.length; i++) {
			System.out.print(actualNumbers[i]);
			onLine++;
			if(onLine == 10) {
				System.out.println();
				onLine = 0;
			}
		}

	}

}
