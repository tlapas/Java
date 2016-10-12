package payings_4;

import payings_4.Contractor;
import payings_4.Employee;
import payings_4.Payable;

public class TestPayIncreasePolyError {

	public static void main(String[] args) {
		//Classes Employee & Contractor extend Person
		//instances of both classes
		Payable workers[] = new Payable[3];
		workers[0] = new Employee("Ana");
		workers[1] = new Contractor("Marko");
		workers[2] = new Employee("Ines");

		//instance of
		for (Payable p : workers) {
			((Payable)p).increasePay(30);
		}
	}

}
