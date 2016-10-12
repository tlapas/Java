package payings_2;

public class Contractor extends Person2 {
	//Constructor
	Contractor(String name) {
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
