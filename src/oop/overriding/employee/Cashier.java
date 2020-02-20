package oop.overriding.employee;

public class Cashier extends Employee {
	
	@Override
	public void work() {
		System.out.println("he is working.");
	}
	
	public static void main(String[] args) {
		Cashier c = new Cashier();
		c.work();
		

	}

}
