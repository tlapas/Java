package payings_5;

public class Contractor implements Payable {
	private String name;
	//Constructor
	Contractor(String name) {
		this.name = name;
	}
	
	public boolean increasePay(int percent) {
		if (percent < INCREASE_CAP) {
			System.out.println("Increase salary by " + percent + "%. " + name);
			return true;
		}
		else {
			System.out.println("Salary cannot be increased because " + name + " is Contractor." );
			return false;
		}
	}

}
