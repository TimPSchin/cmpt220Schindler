package softwareDevelopement;

public class Savings extends Account{

	double limit = 0;
	
	public Savings(int id, double balance) {
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
