package payings_2;

public class Employee extends Person2 {
	
	//Constructor
	Employee(String name) {
		super(name);
	}


	public boolean increasePay(int percent) {
		System.out.println("Increase salary by " + percent + "%. " + getName());
		return true;
	}
	
}
