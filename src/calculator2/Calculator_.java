package calculator2;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator_ {

		private JPanel windowContent, p1;
		private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
		private JTextField displayField;
		
		public String getDisplayFieldTxt() {
			return displayField.getText();
		}

		public void setDisplayFieldTxt(String txt) {
			displayField.setText(txt);
		}
		
		Calculator_() {
			windowContent = new JPanel();
			BorderLayout bl = new BorderLayout();
			windowContent.setLayout(bl);
			
			displayField = new JTextField(30);
			windowContent.add("North", displayField);
			
			b0 = new JButton("0");
			b1 = new JButton("1");
			b2 = new JButton("2");
			b3 = new JButton("3");
			b4 = new JButton("4");
			b5 = new JButton("5");
			b6 = new JButton("6");
			b7 = new JButton("7");
			b8 = new JButton("8");
			b9 = new JButton("9");
			b10 = new JButton("+");
			b11 = new JButton("-");
			b12 = new JButton("*");
			b13 = new JButton("/");
			b14 = new JButton(".");
			b15 = new JButton("=");
			
			p1 = new JPanel();
			GridBagLayout gb = new GridBagLayout();
			p1.setLayout(gb);
			
			GridBagConstraints c = new GridBagConstraints();
			c.gridx = 0;
			c.gridy = 0;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b1,c);
			c.gridx = 1;
			c.gridy = 0;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b2,c);
			c.gridx = 2;
			c.gridy = 0;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b3,c);
			c.gridx = 0;
			c.gridy = 1;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b4,c);
			c.gridx = 1;
			c.gridy = 1;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b5,c);
			c.gridx = 2;
			c.gridy = 1;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b6,c);
			c.gridx = 0;
			c.gridy = 2;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b7,c);
			c.gridx = 1;
			c.gridy = 2;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b8,c);
			c.gridx = 2;
			c.gridy = 2;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b9,c);
			c.gridx = 0;
			c.gridy = 3;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b0,c);
			c.gridx = 3;
			c.gridy = 0;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b10,c);
			c.gridx = 3;
			c.gridy = 1;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b11,c);
			c.gridx = 3;
			c.gridy = 2;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b12,c);
			c.gridx = 1;
			c.gridy = 3;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b13,c);
			c.gridx = 2;
			c.gridy = 3;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b14,c);
			c.gridx = 3;
			c.gridy = 3;
			c.gridheight = 1;
			c.gridwidth = 1;
			p1.add(b15,c);
			windowContent.add("Center", p1);
			
			JFrame jf = new JFrame("Calculator");
			jf.setContentPane(windowContent);
			jf.pack();
			jf.setVisible(true);
			
			CalculatorEngine_ calc = new CalculatorEngine_(this);
			b0.addActionListener(calc); 
			b1.addActionListener(calc); 
			b2.addActionListener(calc); 
			b3.addActionListener(calc); 
			b4.addActionListener(calc); 
			b5.addActionListener(calc); 
			b6.addActionListener(calc); 
			b7.addActionListener(calc); 
			b8.addActionListener(calc);
			b9.addActionListener(calc); 
			b10.addActionListener(calc); 
			b11.addActionListener(calc);
			b12.addActionListener(calc); 
			b13.addActionListener(calc); 
			b14.addActionListener(calc); 
			b15.addActionListener(calc);
			displayField.addActionListener(calc);
		}


	public static void main(String[] args) {
		new Calculator_();		
	}

}
