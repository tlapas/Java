package calculator.FlowLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {

	public static void main(String[] args) {
		//napraviti Panel (paletu) - u njega se stavljaju svi elementi i za nega se odreðuje izgled (upravljaè rasporeda)
		//on se potom stavlja u frame
		
		//Panel
		JPanel jp = new JPanel();
		
		//LLayout (upravljaè rasporeda)
		//FL - svi elementi se smještaju u liniju
		FlowLayout fl = new FlowLayout();
		//na panel se postavlja upravljaè rasporeda
		jp.setLayout(fl);
		
		//kreiranje elemenata
		JLabel lab = new JLabel("Number 1");
		JTextField tf = new JTextField(10);
		
		JLabel lab2 = new JLabel("Number 2");
		JTextField tf2 = new JTextField(10);
		
		JLabel lab3 = new JLabel("Sum");
		JTextField tf3 = new JTextField(10);
		
		JButton btn = new JButton("Calculate");
		
		//dodavanje elemenata u panel
		jp.add(lab);
		jp.add(tf);		
		jp.add(lab2);
		jp.add(tf2);		
		jp.add(lab3);
		jp.add(tf3);		
		jp.add(btn);
		
		//kreiranje framea i postavljanje velièina
		JFrame jf = new JFrame("Calculator");
		jf.setSize(400, 200);
		//dodavanje panela u frame (dodavanje konteksta frameu)
		jf.setContentPane(jp);
		//
		//postavljanje framea da bude vidljiv
		jf.setVisible(true);
	}
}
