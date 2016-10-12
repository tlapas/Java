package payings_5;

public class Employee implements Payable {
	private String name;
	//Constructor
	Employee(String name) {
		this.name = name;
	}


	public boolean increasePay(int percent) {
		System.out.println("Increase salary by " + percent + "%. " + name);
		return true;
	}
	
}
