package SuperKeywordExample;

	public class Vehicle {
		  Vehicle(){
			System.out.println("Vehicle is created");
		}
	}
	class Car extends Vehicle{
		Car(){
			super();
			System.out.println("Car is created");
		}

	public static void main(String[] args) {
		Car c = new Car();
		
		

	}

}
