package softwareDevelopement;

public class Course {
	private String courseName;
	private String[] students = new String[5];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		if(numberOfStudents == students.length) {
			String[] moreStudents = new String[numberOfStudents+5];
		}else {
			students[numberOfStudents] = student;
			numberOfStudents++;	
		}
	}
	
	//clearing students

	public void clear() {
		for(int i = getNumberOfStudents(); i >= 0; i--) {
			students[i] = "";
		}
		numberOfStudents = 0;
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				for (int j=i+1; j < numberOfStudents; j++)
					students[j - 1] = students[j];
				numberOfStudents--;
				return;
			}
		}
	}
}
