package softwareDevelopement;

public class SportCar implements Printable{

	public String type;
	public int plateNumber;
	
	public SportCar(String n, int p) {
		this.type = n;
		this.plateNumber = p;
	}

	@Override
	public void print() {
		System.out.println("The name is a " + type + "and the plate number is " + plateNumber);
	}
	
}
