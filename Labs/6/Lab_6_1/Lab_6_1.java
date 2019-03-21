package softwareDevelopement;

public class Lab_6_1 {

	public static void main(String[] args) {
		
		
		Square s1 = new Square(40);
		Square s2 = new Square(35.9);
		
		System.out.println("For square 1 the width is " + s1.getWidth() + ", the area is " + s1.getArea() + ", the perimeter is " + s1.getPerimeter() + ".");
		System.out.println("For square 2 the width is " + s2.getWidth() + ", the area is " + s2.getArea() + ", the perimeter is " + s2.getPerimeter() + ".");
	}
}
