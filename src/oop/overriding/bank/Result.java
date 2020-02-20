package oop.overriding.bank;

public class Result {
	

	public static void main(String[] args) {
		Bok b = new Bok();
		System.out.println("Bok rate:"+b.getrate());
		Chase c=new Chase();
		System.out.println("Chase rate:"+c.getrate());
		Discover d=new Discover();
		System.out.println("Dicsover rate:"+d.getrate());
	}

}
