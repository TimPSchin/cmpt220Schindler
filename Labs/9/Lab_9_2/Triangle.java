package softwareDevelopement;

public class Triangle extends GeometricObject {

	public double side1 = 1;
	public double side2 = 1;
	public double side3 = 1;
	
	public Triangle() {}
	
	
	public Triangle(double s1, double s2, double s3) throws IllegalTriangleException {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
		if(side1 + side2 < side3 || side3 + side2 < side1 || side1 + side3 < side2) {
			throw new IllegalTriangleException();
		}
	}
	
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double p = getPerimeter() / 2; 
		return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return "Triangle: side 1 = " + side1 + " side 2 = " + side2 + " side 3 = " + side3;
	}
	
	
}
