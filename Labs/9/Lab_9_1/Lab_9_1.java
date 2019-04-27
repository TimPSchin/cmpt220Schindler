package softwareDevelopement;
import java.util.Scanner;
public class Lab_9_1 {

	public static void main(String[] args) {
		Scanner banter = new Scanner(System.in);
		int[] array = new int[100];
		for(int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random()*100 + 1);
		}
		
		System.out.println("What index do you want?");
		int num = banter.nextInt();
		
		try{
			int value = array[num-1];
			System.out.println("That number is " + value);
		}
		catch(ArrayIndexOutOfBoundsException ex) {	
			System.out.println("Out of Bounds");
		}
			
		
	
	}
}
