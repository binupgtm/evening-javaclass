package oop.overriding;

public class Goat extends Animal {
	
	@Override
	public void eat() {
		System.out.println("we can eat!");
	}

	public static void main(String[] args) {
		Goat g = new Goat();
		g.eat();
		

	}

}
