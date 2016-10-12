package payings_4;

public class Contractor extends Person4 implements Payable {
	//Constructor
	public Contractor(String name) {
		super(name);
	}
	
	public boolean increasePay(int percent) {
		if (percent < INCREASE_CAP) {
			System.out.println("Increase salary by " + percent + "%. " + getName());
			return true;
		}
		else {
			System.out.println("Salary cannot be increased because " + getName() + " is Contractor." );
			return false;
		}
	}

}
