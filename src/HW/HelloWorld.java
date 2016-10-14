package HW;

import javax.swing.*;

public class HelloWorld extends JFrame{

	//constructor that has all the informations for the frame (position, size)
	public HelloWorld() {
		setSize(200,300);
		setTitle("Hello World!");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//need to make instance
		HelloWorld hv = new HelloWorld();
		
		JButton bt = new JButton("Click me");
		hv.add(bt);
	}
}
