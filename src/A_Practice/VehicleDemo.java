package A_Practice;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle c = new Car();
		System.out.print               ("My car has "+c.getNumberOfSeats()+" seats"+" & "+c.getNumberOfWhells()+" Whells.");
		System.out.println("It's from "+c.getTypeOfBrand()+ ".");
		
		Vehicle b= new Bike();
		System.out.print("My bike has "+b.getNumberOfSeats()+" seats"+" & "+b.getNumberOfWhells()+" Whells.");
		System.out.println("It's from "+b.getTypeOfBrand()+".");

	}

}
