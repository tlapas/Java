package payings;

public class Contractor extends Person implements Payable {
	int ID;
	String name;

	//Constructor
	Contractor(){}

	Contractor(int ID, String name){
		this.ID = ID;
		this.name = name;
	}

	//Setter
	public void setID (int ID) {
		this.ID = ID;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Getter
	public int getID() {
		return ID;		
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean increasePay(int percent) {
		if (percent < INCREASE_CAP) {
			System.out.println("Increase salary by " + percent + "%. " + getName());
		}
		else {
			System.out.println("Salary cannot be increased because " + getName() + " is Contractor." );
		}
		return true;
	}

}
