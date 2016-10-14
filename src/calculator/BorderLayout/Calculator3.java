package calculator.BorderLayout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator3 {

	public static void main(String[] args) {
		// Panel
		JPanel jp = new JPanel();
		
		// Layout
		BorderLayout bl = new BorderLayout();

		// Panel Layout
		jp.setLayout(bl);
		
		// kreiranje elemenata
		JLabel lab = new JLabel("Number 1");
		JTextField tf = new JTextField(10);

		JLabel lab2 = new JLabel("Number 2");
		JTextField tf2 = new JTextField(10);

		JLabel lab3 = new JLabel("Sum");
		JTextField tf3 = new JTextField(10);

		JButton btn = new JButton("Calculate");

		// dodavanje elemenata u panel
		jp.add("East", lab);
		jp.add("West", tf);
		jp.add("East", lab2);
		jp.add("West", tf2);
		jp.add("North", lab3);
		jp.add("South", tf3);
		jp.add("Center", btn);
		
		//Frame
		JFrame jf = new JFrame("Calculator");
		jf.setSize(400, 100);
		jf.setContentPane(jp);
		jf.setVisible(true);
	
	}

}
