package softwareDevelopement;

public class Checking extends Account{

	double limit = -100;
	
	public Checking(int id, double balance) {
		super(id, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		if(getBalance() - amount >= limit) {
			super.withdraw(amount);
		}
	}
	
	@Override
	public String toString() {
		return "Type: Generic account;  ID: " + getId() + ";  balance: " + getBalance();
	}
}
