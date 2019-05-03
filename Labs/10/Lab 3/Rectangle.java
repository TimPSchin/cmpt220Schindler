package softwareDevelopement;

public class Rectangle implements Printable{

	double length;
	double width;
	
	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}

	@Override
	public void print() {
		System.out.println("The rectanlge has a length of " + length + "and a width of " + width);
		
	}
	
	
}
