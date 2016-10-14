package calculator2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculatorEngine_ implements ActionListener {
	private Calculator_ parent;
	private Object pressed;
	private JButton pressedButton;
	private String pressedTxt, displayTxt;
	int a, b;
	int sum = 0, diff = 0;
	float umn, dij;

	CalculatorEngine_(Calculator_ parent) {
		this.parent = parent;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<String> num = new ArrayList<String>();
		pressed = e.getSource();
		displayTxt = parent.getDisplayFieldTxt();
		if (pressed instanceof JButton) {
			pressedButton = (JButton) pressed;
			pressedTxt = pressedButton.getText();
			parent.setDisplayFieldTxt(displayTxt + pressedTxt);
		}
		//else if(pressed instanceof JTextField) {
		//	displayTxt = parent.getDisplayFieldTxt();
		//}
		
		switch(pressedTxt) {
		case "+":
			num = (ArrayList<String>) Arrays.asList(parent.getDisplayFieldTxt().split("+"));
			//a = Integer.parseInt(parent.getDisplayFieldTxt().substring(0,parent.getDisplayFieldTxt().length()-1));
			for (String a: num) {
				sum += Integer.parseInt(a);
			}
			pressedTxt = "Suma: " + sum;
			break;
		case "-":
			pressedTxt = "MINUS!";
			break;
		case "/":
			pressedTxt = "DIJELJENO!";
			break;
		case "*":
			pressedTxt = "PUTA!";
		}
		JOptionPane.showConfirmDialog(null, "You pressed " + pressedTxt, "Practice", JOptionPane.PLAIN_MESSAGE);
	}

}
