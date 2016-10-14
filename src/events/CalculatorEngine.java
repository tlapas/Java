package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class CalculatorEngine implements ActionListener {
	//Referenca na kalkulator
	GridBagCalculator parent;
	
	JButton clickedButton = null;
	String clickedButtonTxt = "Nešto";
	int sum, raz, a, b;
	float umn, kvoc;
	
	//konstruktor èuva referencu na kalkulator
	CalculatorEngine(GridBagCalculator parent) {
		this.parent = parent;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// uzima izvor dogaðaja
		Object src = e.getSource();
		String displayedFieldTxt = parent.getDisplayValue();
		if (src instanceof JButton) {
			clickedButton = (JButton) src;			
			clickedButtonTxt = clickedButton.getText();
			switch(clickedButtonTxt) {
			case "+":
				sum = a+b;
				break;
			case "-":
				raz = a-b;
				break;
			case "*":
				umn = a*b;
				break;
			case "/":
				kvoc = a/b;
				break;
			}
		}
		// dodaje netpis s gumba u tekst poruke
		JOptionPane.showConfirmDialog(null, "You Pressed " + clickedButtonTxt, "Just a Test",
				JOptionPane.PLAIN_MESSAGE);
	}

}
