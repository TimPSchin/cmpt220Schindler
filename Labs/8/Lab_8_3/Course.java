package softwareDevelopement;

import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList<String> students = new ArrayList<>();
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students.add(student);
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students.toArray(new String[students.size()]);
	}

	public int getNumberOfStudents() {
		return students.size();
	}
	
	public void dropStudent(String student) {
		students.remove(student);
	}

}

