package abstInterf;

public class Employee extends Person3 implements Payable {
	int ID;
	String name;	
	
	//Constructor
	Employee(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	Employee() {}
	
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
		System.out.println("Increase salary by " + percent + "%. " + getName());
		return true;
	}
}
