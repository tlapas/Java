package payings_4;

public class Employee extends Person4 implements Payable {
	
	//Constructor
	public Employee(String name) {
		super(name);
	}


	public boolean increasePay(int percent) {
		System.out.println("Increase salary by " + percent + "%. " + getName());
		return true;
	}
	
}
