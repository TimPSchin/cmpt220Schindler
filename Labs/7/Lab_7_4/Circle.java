package softwareDevelopement;

public class Circle {

	public double x;
	public double y;
	public double radius;
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public Circle() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public boolean contains(double x2, double y2) {
		double distance = Math.sqrt((Math.pow(x2 - x, 2)) + (Math.pow(y2 - y, 2)));
		if(radius >= distance)
			return true;
		return false;
	}
	
	public boolean contains(Circle circle) {
		double distance = Math.sqrt((Math.pow(circle.getX() - x, 2)) + (Math.pow(circle.getY() - y, 2)));
		if((distance + circle.getRadius()) <= radius)
			return true;
		return false;
	}
	
	 public boolean overlaps(Circle circle) {
		 double distance = Math.sqrt((Math.pow(circle.getX() - x, 2)) + (Math.pow(circle.getY() - y, 2))); 
		 if(distance <= (radius + circle.getRadius()))
			 return true;
		 return false;
	 }
	
	
	
	
	
	
	
	
}
