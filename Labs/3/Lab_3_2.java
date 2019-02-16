package softwareDevelopement;

public class Lab_3_2 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 100; i <= 501; i++) {
			if(i % 5 == 0 ^ i % 7 == 0) {
				System.out.print(i + " ");
				count++;
			}
			if(count % 10 ==0) {
				System.out.println("");
			}
			
		}
		
	}
}
