package tax;

class CroTax extends Tax {
	Tax t = new Tax();
	public double prilagodbaZaStudente(double porez) {
		double prilagPorez = porez - 500;
		return prilagPorez;
	}
	
	//u ovakvom spoju izvršavala bi se ova metoda, a ne ona iz Tax
	/*public double izracunPoreza() {
		return 1;
	}*/
}