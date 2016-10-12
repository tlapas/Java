package payings_4;

public class ForeignContractor extends Person4 implements Payable {
	public ForeignContractor(String name) {
		super(name);
	}

	@Override
	public boolean increasePay(int percent) {
		System.out.println("I'm just Foreign Contractor!");
		return true;
	}
}
