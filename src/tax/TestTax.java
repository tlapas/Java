package tax;

//import java.util.Scanner;

public class TestTax extends CroTax {

	static CroTax t = new CroTax();

	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("Broj argumenata nije valjan!");
			System.exit(0);
		}
		
		//korisnicki unos
		/*Scanner scan = new Scanner(System.in);

		System.out.println("Godisnji prihod: ");
		t.setGodisnjiPrihod(scan.nextInt());

		System.out.println("Drzava: ");
		t.setDrzava(scan.next());

		System.out.println("Broj uzdrzavanih clanova: ");
		t.setBrojUzdrzavanihClanova(scan.nextInt());
		
		scan.close();*/
		
		//"predefinirani" argumenti
		t.setGodisnjiPrihod(Integer.parseInt(args[0]));
		t.setDrzava(args[1]);
		t.setBrojUzdrzavanihClanova(Integer.parseInt(args[2]));


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
