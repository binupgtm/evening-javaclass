package oop.overloading;

public class Calculatin2 {
	
	void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	void sum(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Calculatin2 cal = new Calculatin2();
		cal.sum(50, 30);
		cal.sum(20.5, 10.5);
		
	}

}
