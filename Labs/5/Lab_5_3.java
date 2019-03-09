package softwareDevelopement;
import java.util.Scanner;
public class Lab_5_3 {
	public static void main(String args[]) {
		Scanner banter = new Scanner(System.in);
		
		System.out.println("How many students are there? ");
		int amount = banter.nextInt();
		
		double[] scores = new double[amount];
		String[] names = new String[amount];
		
		for(int i = 0; i < amount; i++) {
			System.out.print("Enter their name and score: ");
			names[i] = banter.next();
			scores[i] = banter.nextDouble();
		}
		
		String holdName;
		for (int i = 0; i < scores.length; i++) {
		    for (int j = i; j < scores.length; j++) {
		      if (scores[j] < scores[i]) {
		        double temp = scores[j];
		        scores[j] = scores[i];
		        scores[i] = temp;
		        
		        holdName = names[i];
			    names[j] = names[i];
		        names[i] = holdName;
		      }
		    }
		    
		    
		}
		
		for(int i = 0; i < amount; i++) {
			System.out.println(names[i] + " has a score of " + scores[i]);
		}
		
	}
	
	
	
}
