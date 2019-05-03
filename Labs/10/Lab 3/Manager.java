package softwareDevelopement;

public class Manager extends Employee implements Printable{

	public Manager(String name, double age, double hourRate) {
		super(name, age, hourRate);
	}

	@Override
	public double salary(double hours) {
		return 12*hours;
	}

	@Override
	public void print() {
		System.out.println("The manager's name is " + name + ". They are " + age + " years old and earned " + salary(hourRate));		
	}

}
