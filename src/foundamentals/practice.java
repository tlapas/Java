package foundamentals;

public class practice {
	public static void main(String[] args) {

		String a[] = new String[10];
		a[3] = "Minix";
		a[5] = "Mali";

		int len = a.length;
		System.out.println("A: " + len);
		for (int i = 0; i < len; i++) {
			System.out.println(a[i]);
		}
		System.out.println("CONTINUE -> ispisi samo imena");
		for (String osoba : a) {
			if (osoba == null)
				continue;
			System.out.println(osoba);
		}
		System.out.println("BREAK -> kad naidjes na null izadji");
		for (String osoba : a) {
			if (osoba == null)
				break;
			System.out.println(osoba);
		}

		// telefoni
		System.out.println("imenik");
		String tel[][] = new String[3][2];
		tel[0][0] = "Iva";
		tel[0][1] = "123-123";
		tel[1][0] = "Ana";
		tel[1][1] = "456-456";
		tel[2][0] = "Iva";
		tel[2][1] = "789-789";

		len = tel.length;
		System.out.println("tel: " + len);
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(tel[i][j]);
			}
		}

		// TODO Auto-generated method stub

	}

}
