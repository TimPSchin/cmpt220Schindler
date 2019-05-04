package softwareDevelopement;

public class Appliance implements Comparable<Appliance> {

	private double voltage;
	private String color;
	private String madeIn;
	double price;
	
	public Appliance(double v, String c, String m, double p) {
		this.voltage = v;
		this.color = c;
		this.madeIn = m;
		this.price = p;
	}
	
	public double getVoltage() {
		return voltage;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getMadeIn() {
		return madeIn;
	}
	
	public double price() {
		return price;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	

	@Override
	public int compareTo(Appliance arg0) {
		if(arg0 != null) {
			if(arg0 instanceof Appliance) {
				Appliance app = (Appliance) arg0;
				if(this.price > app.price) {
					return 1;
				}else if(this.price < app.price) {
					return -1;
				}else {
					return 0;
				}
			}else {
				return 0;
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
