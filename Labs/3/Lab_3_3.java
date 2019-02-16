package softwareDevelopement;

public class Lab_3_3 {
	public static void main(String[] args) {
		int count = 0;
		for(char i = 50; i <=100; i++) {
			System.out.print(i);
			count++;
			if(count % 20 ==0) {
				System.out.println("");
			}
			
		}
		
	}
}