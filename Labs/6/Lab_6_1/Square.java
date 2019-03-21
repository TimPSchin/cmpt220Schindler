package softwareDevelopement;

public class Square {

	public double width;
	
	public Square(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return width*width;
	}
	
	public double getPerimeter() {
		return width*4;
	}
	
	public double getWidth() {
		return width;
	}
	
}