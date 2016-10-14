package events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GridBagCalculator {
	private JPanel windowContent, p1;
	private JTextField displayField = new JTextField();
	private JButton b0 = new JButton("0"), b1 = new JButton("1"), b2 = new JButton("2"), b3 = new JButton("3"),
			b4 = new JButton("4"), b5 = new JButton("5"), b6 = new JButton("6"), b7 = new JButton("7"),
			b8 = new JButton("8"), b9 = new JButton("9"), bP = new JButton("."), bE = new JButton("="),
			b10 = new JButton("-"), b11 = new JButton("+"), b12 = new JButton("/"), b13 = new JButton("*");
	
	public void setDisplayValue(String val) {
		displayField.setText(val);
	}
	
	public String getDisplayValue() {
		return displayField.getText();
	}

	GridBagCalculator() {
		// Layout
		GridBagLayout gb = new GridBagLayout();
		windowContent = new JPanel();
		windowContent.setLayout(gb);

		// Constraints
		GridBagConstraints c = new GridBagConstraints();
		GridBagConstraints c1 = new GridBagConstraints();
		// tf
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 0;
		c.gridy = 0;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 6;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		// gb.setConstraints(displayField, c);
		// add component to window
		windowContent.add(displayField, c);

		p1 = new JPanel();
		p1.setLayout(gb);
		// 7
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 0;
		c.gridy = 1;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b7, c);
		// 8
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 1;
		c.gridy = 1;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b8, c);
		// 9
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 2;
		c.gridy = 1;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b9, c);
		// 4
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 0;
		c.gridy = 2;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b4, c);
		// 5
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 1;
		c.gridy = 2;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b5, c);
		// 6
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 2;
		c.gridy = 2;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b6, c);
		// 1
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 0;
		c.gridy = 3;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b1, c);
		// 2
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 1;
		c.gridy = 3;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b2, c);
		// 3
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 2;
		c.gridy = 3;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b3, c);
		// 0
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 0;
		c.gridy = 4;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b0, c);
		// .
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 1;
		c.gridy = 4;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(bP, c);
		
		// =
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 2;
		c.gridy = 4;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(bE, c);

		// -
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 5;
		c.gridy = 1;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b10, c);

		// +
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 5;
		c.gridy = 2;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b11, c);

		///
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 5;
		c.gridy = 3;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b12, c);

		// *
		c.fill = c.CENTER;
		// coordinates
		c.gridx = 5;
		c.gridy = 4;
		// height, width
		c.gridheight = 1;
		c.gridwidth = 1;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		p1.add(b13, c);

		windowContent.add(p1, c);

		// Frame
		JFrame fr = new JFrame("Calculator");
		fr.setSize(300, 200);
		;
		fr.setContentPane(windowContent);
		fr.setVisible(true);

		CalculatorEngine ce = new CalculatorEngine(this);
		b0.addActionListener(ce);
		b1.addActionListener(ce);
		b2.addActionListener(ce);
		b3.addActionListener(ce);
		b4.addActionListener(ce);
		b5.addActionListener(ce);
		b6.addActionListener(ce);
		b7.addActionListener(ce);
		b8.addActionListener(ce);
		b9.addActionListener(ce);
		bP.addActionListener(ce);
		bE.addActionListener(ce);
		b10.addActionListener(ce);
		b11.addActionListener(ce);
		b12.addActionListener(ce);
		b13.addActionListener(ce);
	}

	public static void main(String[] args) {
		new GridBagCalculator();
	}

}
