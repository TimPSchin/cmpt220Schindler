package softwareDevelopement;

public class Lab_7_3 {

	public static void main(String[] args) {
		Course course = new Course("Class");
		
		course.addStudent("Tim");
		course.addStudent("Mike");
		course.addStudent("Frankie");
		
		course.dropStudent("Mike");
		
		System.out.println("The students in the course are:" + course.getStudents());
	}
}
