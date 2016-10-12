package payings_2;

abstract public class Person2 {
	private String name;
	int INCREASE_CAP = 20;
	
	public Person2(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void changeAdress(String address) {
		System.out.println(getName() + " address is " + address);
	}
	
	public void giveDayOff() {
		System.out.println("Giving a day off to " + name);
	}
	
	public void promote(int percent) {
		System.out.println(" Promoting worker...");
		giveDayOff();
		increasePay(percent);
	}
	
	
	public abstract boolean increasePay(int percent);
	
	public static void main(String args[]) {	
		//Classes Employee & Contractor extend Person
		//instances of both classes
		Person2 workers[] = new Person2[3];
		workers[0] = new Employee("Ana");
		workers[1] = new Contractor("Marko");
		workers[2] = new Employee("Ines");

		for (Person2 p : workers) {
			p.promote(30);
		}
	}	
}
