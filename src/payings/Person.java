package payings;

public class Person {
	public static void main(String args[]) {	
		//Classes Employee & Contractor extend Person
		//instances of both classes
		Person workers[] = new Person[10];
		workers[0] = new Employee(1,"Ana");
		workers[1] = new Contractor(2,"Marko");
		workers[2] = new Employee(3,"Ines");
		workers[3] = new Contractor(4,"Mario");
		workers[4] = new Employee(5,"Sanja");
		workers[5] = new Contractor(6,"Alen");
		workers[6] = new Employee(7,"Lana");
		workers[7] = new Contractor(8,"Leo");
		workers[8] = new Employee(9,"Renata");
		workers[9] = new Contractor(10,"Sandro");

		//instance of
		Employee currEmp;
		Contractor currCont;
		for (Person p : workers) {
			if (p instanceof Employee) {
				currEmp = (Employee) p;
				currEmp.increasePay(30);
			}
			else if (p instanceof Contractor) {
				currCont = (Contractor) p;
				currCont.increasePay(30);
			}
		}
	}

	
}
