package softwareDevelopement;

public class Bond {

	public double coupon;
	public int payments;
	public double interest;
	public double valueMaturity;
	
	public Bond(double coupon, int payments, double interest, double valueMaturity) {
		this.coupon = coupon;
		this.interest = interest;
		this.payments = payments;
		this.valueMaturity = valueMaturity;
	}
	
	public Bond() {
	}
	
	public double getPrice() {
		return coupon * (1-(1/Math.pow((1+interest), payments))) + valueMaturity * (1/Math.pow((1+interest), payments));
	}
}
