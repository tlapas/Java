package tax;

import java.util.Scanner;

public class TestTax extends CroTax {

	static CroTax t = new CroTax();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Godisnji prihod: ");
		t.setGodisnjiPrihod(scan.nextInt());

		System.out.println("Drzava: ");
		t.setDrzava(scan.next());

		System.out.println("Broj uzdrzavanih clanova: ");
		t.setBrojUzdrzavanihClanova(scan.nextInt());
		
		scan.close();

		ispisPoreza();
	}

	static void ispisPoreza() {
		System.out.println("Iznos vaseg poreza je: ");
		String drz = t.getDrzava();
		if (drz.equals("Hrvatska"))
			System.out.println("" + t.prilagodbaZaStudente(t.izracunPoreza()));
		else
			System.out.println("" + t.izracunPoreza());
	}
}
