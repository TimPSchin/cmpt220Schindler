package softwareDevelopement;

public class Lab_8_11_3 {

	public static void main(String[] args) {
		Account a1 = new Account(1, 400);
		Checking c1 = new Checking(2, 300);
		Savings s1 = new Savings(3, 500);
		
		System.out.println(a1.toString());
		System.out.println(c1.toString());
		System.out.println(s1.toString());
	}
}
