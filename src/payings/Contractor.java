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

	@Override
	public boolean increasePay(int percent) {
		// TODO Auto-generated method stub
		return false;
	}

}
