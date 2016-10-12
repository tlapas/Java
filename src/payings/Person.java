package payings;

public class Person {
	public static void main(String args[]) {	
	//Classes Employee & Contractor extend Person
	//instances of both classes
	Person workers[] = new Person[10];
	workers[0] = new Employee(1,"Ana");
	workers[1] = new Contractor(2,"Marko");
}
}
