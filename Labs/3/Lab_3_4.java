package softwareDevelopement;
public class Lab_3_4 {
	public static void main(String[] args) {
		for(int i =15000; i>2; i--) {
			if(isPrime(i) == true) {
				System.out.println(i);
				break;
			}
		}
	}
	
	private static boolean isPrime(int number) {
			for (int divisor = 2; divisor <=number/2; divisor++) {
				if(number % divisor == 0) {
					return false;
				}
			}
			return true;
	}
}