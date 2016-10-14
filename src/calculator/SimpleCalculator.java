package calculator;

import java.awt.FlowLayout;
import javax.swing.*;

public class SimpleCalculator {
	public static void main(String args[]) {
		//Panel(paleta) JPanel
		JPanel pan = new JPanel();
		
		//Content Manager(upravljaè rasporeda)
		FlowLayout fl = new FlowLayout();
		//adding content manager to panel
		pan.setLayout(fl);
		
		//Memory controls (create)
		JLabel lab = new JLabel("Number 1");
		JTextField tf = new JTextField(10);
		JLabel lab2 = new JLabel("Number 2");
		JTextField tf2 = new JTextField(10);
		JLabel lab3 = new JLabel("Sum: ");
		JTextField tf3 = new JTextField(10);
		JButton btn = new JButton("Calculate");
		
		//Adding Memory controls to Panel
		pan.add(lab);
		pan.add(tf);
		pan.add(lab2);
		pan.add(tf2);
		pan.add(lab3);
		pan.add(tf3);
		pan.add(btn);
		
		//new window, add kontejner to window
		JFrame jf = new JFrame("Calculator");
		//Paleta u kontejner
		jf.setContentPane(pan);
		
		jf.setSize(400,300);
		//prikazuje
		jf.setVisible(true);
	}
}
