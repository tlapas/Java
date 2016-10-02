package tax;

class Tax {
	double godisnjiPrihod;
	String drzava;
	int brojUzdrzavanihClanova;

	// konstruktor
	Tax() {
	}

	Tax(double gp, String dr, int brCl) {
		this.godisnjiPrihod = gp;
		this.drzava = dr;
		this.brojUzdrzavanihClanova = brCl;
	}

	// getter
	double getGodisnjiPrihod() {
		return godisnjiPrihod;
	}

	String getDrzava() {
		return drzava;
	}

	// setteri
	void setGodisnjiPrihod(double gp) {
		this.godisnjiPrihod = gp;
	}

	void setDrzava(String dr) {
		this.drzava = dr;
	}

	void setBrojUzdrzavanihClanova(int brCl) {
		this.brojUzdrzavanihClanova = brCl;
	}

	double izracunPoreza() {
		if (this.godisnjiPrihod < 30000) {
			return (this.godisnjiPrihod * 0.05);
		} else
			return (this.godisnjiPrihod * 0.06);
	}
}
