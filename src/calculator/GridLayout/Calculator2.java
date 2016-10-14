package calculator.GridLayout;

import java.awt.GridLayout;
import javax.swing.*;

public class Calculator2 {

	public static void main(String[] args) {
		// Panel
		JPanel jp = new JPanel();

		// Layout (upravljaè rasporeda)
		// GL - elementi se postavljaju u mrežu (broj redaka, broj stupaca)
		GridLayout gl = new GridLayout(4,2);

		// dodavanje layouta na panel
		jp.setLayout(gl);

		// kreiranje elemenata
		JLabel lab = new JLabel("Number 1");
		JTextField tf = new JTextField(10);

		JLabel lab2 = new JLabel("Number 2");
		JTextField tf2 = new JTextField(10);

		JLabel lab3 = new JLabel("Sum");
		JTextField tf3 = new JTextField(10);

		JButton btn = new JButton("Calculate");

		// dodavanje elemenata u panel
		jp.add(lab);
		jp.add(tf);
		jp.add(lab2);
		jp.add(tf2);
		jp.add(lab3);
		jp.add(tf3);
		jp.add(btn);
		
		//Frame - glavni okvir aplikacije
		JFrame jf = new JFrame ("Calculator");
		jf.setSize(400, 100);
		
		//dodavanje konteksta
		jf.setContentPane(jp);
		jf.setVisible(true);
	}

}
