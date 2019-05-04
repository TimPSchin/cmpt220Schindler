package softwareDevelopement;

public class Toaster extends Appliance{
	
	String type;
	int numOfSlots;
	int heatLevel;
	

	public Toaster(double v, String c, String m, double p, String type, int numOfSlots, int heatLevel) {
		super(v, c, m, p);
		this.type = type;
		this.numOfSlots = numOfSlots;
		this.heatLevel = heatLevel;
	}

	public String getType() {
		return type;
	}

	public int getNumOfSlots() {
		return numOfSlots;
	}

	public int getHeatLevel() {
		return heatLevel;
	}
	

}
	