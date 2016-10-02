package car;

public class JamesBondCar extends Car {
	int currentSubmergeDepth;
	boolean isGunonBoard = true;
	final String MANUFACTURER = "Skoda";

	void submerge() {
		currentSubmergeDepth = 50;
	}
	
	void surface() {
		//TODO code
	}
	
	JamesBondCar car1 = new JamesBondCar();
	JamesBondCar car2 = new JamesBondCar();
	
	void setColor() {
		car1.color = "Pink";
		car2.color = "Blue";
	}
}
