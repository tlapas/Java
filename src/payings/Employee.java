package payings;

public class Employee extends Person implements Payable {
	int ID;
	String name;	
	
	//Constructor
	Employee(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	Employee() {}
	
	@Override
	public boolean increasePay(int percent) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
