package softwareDevelopement;

public class Lab_4_5 {
	public static void main(String args[]) {
		double numbers[] = new double[1000];
		double total = 0;
		double random;
		double average = 0;
		double lowTot = 0;
		double lowAm = 0;
		double highTot = 0;
		double highAm =0;
		
		for(int i = 0; i < 1000; i++) {
			random = (int) (Math.random()*100)+1;
			numbers[i] = random;
			total += random;
			average = total/1000;
		}
	
		for(int i = 0; i < 1000; i++) {
			if(numbers[i] < average)
				lowTot++;
			else
				highTot++;
		}

		System.out.println("The average is: " + average);
		System.out.println("The amount lower than the average is: " + lowTot);
		System.out.println("The amount higher than the average is: " + highTot);
	}
}

