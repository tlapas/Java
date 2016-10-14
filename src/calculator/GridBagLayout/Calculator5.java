package calculator.GridBagLayout;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import calculator.combined.Calculator4;

public class Calculator5 {
	JPanel windowContent, p1;
	JTextField displayField;
	JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPoint, btnEqual;

	Calculator5() {
		// Panel
		windowContent = new JPanel();
		// Layout
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		
		
		GridBagLayout gb = new GridBagLayout();
		//windowContent.setLayout(gb);
		// define constraints
		GridBagConstraints constr = new GridBagConstraints();
		//x coordinate
		constr.gridx = 0;
		//y
		constr.gridy = 0;
		//same height as other cells
		constr.gridheight = 1;
		//6 times wider than other cells
		constr.gridwidth = 6;
		//fills up all space in cell
		constr.fill = constr.BOTH;
		//proportion of horizontal space that component uses
		constr.weightx = 1.0;
		//proportion of vertical space that component uses
		constr.weighty = 1.0;
		//component alignment
		constr.anchor = constr.CENTER;
					
		// add elements to windowContent
		displayField = new JTextField();
		//setting up constraints
		gb.setConstraints(displayField, constr);
		windowContent.add("North",displayField);

		// buttons
		btn0 = new JButton("0");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btnPoint = new JButton(".");
		btnEqual = new JButton("=");

		// p1
		p1 = new JPanel();
		// Layout
		GridLayout gl = new GridLayout(4, 3);
		p1.setLayout(gl);
		// add elements to p1
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p1.add(btn5);
		p1.add(btn6);
		p1.add(btn7);
		p1.add(btn8);
		p1.add(btn9);
		p1.add(btn0);
		p1.add(btnPoint);
		p1.add(btnEqual);

		windowContent.add("Center",p1);

		// Frame
		JFrame jf = new JFrame("Calculator");
		jf.setContentPane(windowContent);
		jf.pack();
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator5();
	}

}
