package tax;

class CroTax extends Tax {
	Tax t = new Tax();
	public double prilagodbaZaStudente(double porez) {
		double prilagPorez = porez - 500;
		return prilagPorez;
	}
	
	//u ovakvom spoju izvr�avala bi se ova metoda, a ne ona iz Tax
	//ako �elimo metodu natklase, tada nju pozivamo sa super
	public double izracunPoreza(int a) {
		return -1;
	}
	
	public double izracunPoreza() {
		return super.izracunPoreza();
	}
}