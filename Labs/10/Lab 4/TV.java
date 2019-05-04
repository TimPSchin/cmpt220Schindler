package softwareDevelopement;

public class TV extends Appliance{
	
	double size;
	int resolution; 
	String brand;
	
	public TV(double v, String c, String m, double p, double s, int r, String b) {
		super(v, c, m, p);
		this.size = s;
		this.resolution = r;
		this.brand = b;
	}

	public double getSize() {
		return size;
	}

	public int getResolution() {
		return resolution;
	}

	public String getBrand() {
		return brand;
	}

	
}
