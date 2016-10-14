package calculator.GridBagLayout;

import java.awt.*;
import javax.swing.*;

public class GridBagCalculator {
	JPanel windowContent, p1;
	JTextField tf = new JTextField();
	JButton b0 = new JButton("0"), b1 = new JButton("1"), b2 = new JButton("2"), b3 = new JButton("3"),
			b4 = new JButton("4"), b5 = new JButton("5"), b6 = new JButton("6"), b7 = new JButton("7"),
			b8 = new JButton("8"), b9 = new JButton("9"), bP = new JButton("."), bE = new JButton("=");

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
		c.gridwidth = c.fill;
		// proportion of space that component takes
		c.weightx = 1.0;
		c.weighty = 1.0;
		// gb.setConstraints(tf, c);
		// add component to window
		windowContent.add(tf, c);

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

		windowContent.add(p1, c);

		// Frame
		JFrame fr = new JFrame("Calculator");
		fr.setSize(300, 200);;
		fr.setContentPane(windowContent);
		fr.setVisible(true);

	}

	public static void main(String[] args) {
		new GridBagCalculator();
	}

}
