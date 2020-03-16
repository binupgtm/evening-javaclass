package A_Practice;

//import InheritanceExample.Vehicle;

public class Bike extends Vehicle{
	@Override
	public int getNumberOfSeats() {
		return 2;
	}
	@Override
	public int getNumberOfWhells() {
		return 2;
	}
	public String getTypeOfBrand() {
		return "Bajaj";
	}

}
