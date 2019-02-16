package softwareDevelopement;

public class Lab_3_7 {
	public static void main(String[] args) {
		double count =0;
		double pnum = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		for(int i = 1; i <= 50; i++) {
			b = i*i;
			a = 3*b;
			c = a-i;
			pnum = c/2;
			System.out.print(pnum + " ");
			count++;
			if(count % 20 ==0) {
				System.out.println("");
			}
			
		}
	}
}
