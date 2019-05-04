package softwareDevelopement;

public class Telephone extends Appliance {

	int storage;
	int size;
	String brand;
	
	public Telephone(double v, String c, String m, double p, int st, int si, String b) {
		super(v, c, m, p);
		this.storage = st;
		this.size = si;
		this.brand = b;
	}
	
	public int getStorage() {
		return storage;
	}

	public int getSize() {
		return size;
	}

	public String getBrand() {
		return brand;
	}
}

	
