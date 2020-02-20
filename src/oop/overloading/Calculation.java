package oop.overloading;

public class Calculation {
	
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	void sum(int a,int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		Calculation cal=new Calculation();
		cal.sum(5,5);
		cal.sum(10, 10,10);
		
	}

}
