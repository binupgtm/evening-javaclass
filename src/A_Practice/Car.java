package A_Practice;

//import InheritanceExample.Vehicle;

public class Car extends Vehicle {
	@Override
	public int getNumberOfSeats() {
		return 5;
	}
	@Override
	public int getNumberOfWhells() {
		return 4;
	}
	public String getTypeOfBrand() {
		return "Honda";
	}

}
