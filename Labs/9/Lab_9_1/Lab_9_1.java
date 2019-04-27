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
		if(num > 100 || num < 1) {
			System.out.println("Out of Bounds");
		}else {
		System.out.println("That number is " + array[num-1]);
		}
	}
}
