package softwareDevelopement;
import java.util.Scanner;
public class TriangleTest {

	public static void main(String[] args) {
		
		Scanner banter = new Scanner(System.in);
		System.out.println("Enter one side of the triangle");
		double s1 = banter.nextDouble();
		System.out.println("Enter another side of the triangle");
		double s2 = banter.nextDouble();
		System.out.println("Enter another side of the triangle");
		double s3 = banter.nextDouble();
		Triangle t1 = new Triangle(s1, s2, s3);
		System.out.println("What is the color of the triangle:");
		t1.setColor(banter.nextLine());
		System.out.println("Is the triangle filled");
		t1.setFilled(banter.nextBoolean());
		
		System.out.println("The area of the Triangle is " + t1.getArea());
		System.out.println("The perimeter of the Triangle is " + t1.getPerimeter());
		System.out.println("The color of the triangle is " + t1.getColor());
		System.out.println("The trianlge is filled: " + t1.isFilled());
	}
}
