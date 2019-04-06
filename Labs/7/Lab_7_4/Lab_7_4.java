package softwareDevelopement;

public class Lab_7_4 {

	public static void main(String[] args) {
		Circle c1 = new Circle(2, 2, 5.5);
		
		System.out.println("The area is " + c1.getArea() + " and the perimeter is " + c1.getPerimeter());
		System.out.println(c1.contains(3,3));
		System.out.println(c1.contains(new Circle(4,5,10.5)));
		System.out.println(c1.overlaps(new Circle(3, 5, 2.3)));


	}
}
