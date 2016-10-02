package mix;

import java.util.ArrayList;

public class Mix {

	static ArrayList<String> a = new ArrayList();

	public static void main(String[] args) {
		// boxing - method automatically recognize type
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				a.add(i + "");
			}
			else {
				a.add("Mis" + i);
			}
		}
		for (String zapis: a) {
			System.out.println(zapis);
		}
	}

}
