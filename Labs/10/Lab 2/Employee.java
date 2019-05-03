package softwareDevelopement;

public abstract class Employee {      
	String name;      
	double age;      
	double hourRate;
	
	public Employee(String name, double age, double hourRate) {
		this.name = name;
		this.age = age;
		this.hourRate = hourRate;
	}
	
	public abstract double salary(double hours); 

	public String toString() {   
		return "name= " + name + " age=" + age + " hourRate=" + hourRate;
	}
}
       
